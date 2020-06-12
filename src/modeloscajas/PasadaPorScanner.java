package modeloscajas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PasadaPorScanner {

	private List<Destino> destinos;
	private Double cantidadVias;
	private Double totalCajasAprocesar;
	// en segundos
	private List<PasadaPorScanner> pasadasPorScannerHijas;
	private Double umbralScanner;
	private double tiempoProcesamiento;

	public Double getDestinosPorPasadas() {
		return cantidadVias;
	}

	public double getTiempoProcesamiento() {
		return tiempoProcesamiento;
	}

	public void setTiempoProcesamiento(double tiempoProcesamiento) {
		this.tiempoProcesamiento = tiempoProcesamiento;
	}

	public void agregarDestinoAProcesar(Destino destino) {
		this.destinos.add(destino);
		this.totalCajasAprocesar += destino.getCantidadCajas();
	}

	public PasadaPorScanner(Double cantidadVias) {
		super();
		this.cantidadVias = cantidadVias;
		this.umbralScanner = (double) (1 / cantidadVias);
		this.pasadasPorScannerHijas = null;
		this.destinos = new ArrayList<Destino>();
		this.totalCajasAprocesar = 0.0;
	}

	public List<Destino> getDestinos() {
		return destinos;
	}

	public Double getCantidadVias() {
		return cantidadVias;
	}

	public void setCantidadVias(Double cantidadVias) {
		this.cantidadVias = cantidadVias;
	}

	private void actualizarNumeroProcesamientoDestinos() {
		for (Destino destino : this.destinos) {
			destino.incrementarCantidadDePasadas();
		}
	}

	public Double getTotalCajasAprocesar() {
		return totalCajasAprocesar;
	}

	public void setTotalCajasAprocesar(Double totalCajasAprocesar) {
		this.totalCajasAprocesar = totalCajasAprocesar;
	}

	// devuelve true si = la cantidad de cajas que va a tener el scanner hijo
	// superara el umbral y tiene mas de un destino
	public Boolean estaLlenoElScanner(PasadaPorScanner pasadaScannerHijo, Destino destinoNuevo) {
		Double cantidadCajasRelativasDestino = (double) (pasadaScannerHijo.getTotalCajasAprocesar()
				+ destinoNuevo.getCantidadCajas() / totalCajasAprocesar);
		return (cantidadCajasRelativasDestino > this.umbralScanner && !pasadaScannerHijo.getDestinos().isEmpty());
	}

	private Boolean esElUltimoScanner() {
		return (this.pasadasPorScannerHijas.size() == this.cantidadVias);
	}

	private void asignarDestinosAScannersHijos() {
		// creo primer pasada de scanner hija
		PasadaPorScanner pasadaPorScanner = new PasadaPorScanner(cantidadVias);
		this.pasadasPorScannerHijas.add(pasadaPorScanner);

		for (Destino destino : this.destinos) {
			PasadaPorScanner ultimaPasadaPorScanner = this.pasadasPorScannerHijas
					.get(this.pasadasPorScannerHijas.size() - 1);
			if (!this.estaLlenoElScanner(ultimaPasadaPorScanner, destino) || esElUltimoScanner()) {
				ultimaPasadaPorScanner.agregarDestinoAProcesar(destino);
			} else {
				PasadaPorScanner nuevaPasadaPorScanner = new PasadaPorScanner(cantidadVias);
				nuevaPasadaPorScanner.agregarDestinoAProcesar(destino);
				this.pasadasPorScannerHijas.add(nuevaPasadaPorScanner);
			}
		}
	}

	public void procesarCajas() {
		// ordeno descendentemente por cantidad de cajas
		Collections.sort(destinos, Collections.reverseOrder());
		// si tengo mas o igual vias que periodos el problema se acaba aca
		if (this.destinos.size() > 1) {
			this.pasadasPorScannerHijas = new ArrayList<PasadaPorScanner>();
			asignarDestinosAScannersHijos();
			actualizarNumeroProcesamientoDestinos();
			procesarScannerHijos();
		}

	}

	private void procesarScannerHijos() {
		for (PasadaPorScanner scannerHijo : this.pasadasPorScannerHijas) {
			scannerHijo.procesarCajas();
		}
	}

	public void setearTiempoProcesamiento(double tiempo) {
		this.tiempoProcesamiento = tiempo;

	}

	public List<PasadaPorScanner> getPasadasPorScannerHijas() {
		return pasadasPorScannerHijas;
	}

	public void setPasadasPorScannerHijas(List<PasadaPorScanner> pasadasPorScannerHijas) {
		this.pasadasPorScannerHijas = pasadasPorScannerHijas;
	}

	public ContadorPasadas obtenerCantidadPasdasHijas(ContadorPasadas contadorPasadas) {
		if (this.pasadasPorScannerHijas == null) {
			return contadorPasadas;
		} else {
			for (PasadaPorScanner pasada : this.pasadasPorScannerHijas) {
				if (pasada.getPasadasPorScannerHijas() != null && pasada.getPasadasPorScannerHijas().size() > 1) {
					contadorPasadas.incrementar();
					pasada.obtenerCantidadPasdasHijas(contadorPasadas);
				}
			}
		}

		return contadorPasadas;
	}

	public Integer obtenerCantidadPasdasHijas() {
		ContadorPasadas contadorPasadas = new ContadorPasadas();
		obtenerCantidadPasdasHijas(contadorPasadas);
		return contadorPasadas.getContador();
	}

}