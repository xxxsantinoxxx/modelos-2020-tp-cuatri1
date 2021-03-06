package modeloscajas;

public class Configuraciones {

	public static PasadaPorScanner configuracionUnoA() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));

		mostrarConfiguracion(scanner, "CONFIGURACION 1 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionUnoB() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));

		mostrarConfiguracion(scanner, "CONFIGURACION 1 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionDosA() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 2 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionDosB() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 2 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionTresA() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 3 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionTresB() {

		Double destinosPorPasdas = 2.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));

		mostrarConfiguracion(scanner, "CONFIGURACION 3 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCuatroA() {

		Double destinosPorPasdas = 3.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(30, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));

		mostrarConfiguracion(scanner, "CONFIGURACION 4 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCuatroB() {

		Double destinosPorPasdas = 3.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(30, "A"));
		scanner.agregarDestinoAProcesar(new Destino(30, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));

		mostrarConfiguracion(scanner, "CONFIGURACION 4 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCincoA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));

		mostrarConfiguracion(scanner, "CONFIGURACION 5 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionCincoB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));

		mostrarConfiguracion(scanner, "CONFIGURACION 5 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSeisA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));

		mostrarConfiguracion(scanner, "CONFIGURACION 6 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSeisB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));

		mostrarConfiguracion(scanner, "CONFIGURACION 6 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSieteA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));

		mostrarConfiguracion(scanner, "CONFIGURACION 7 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionSieteB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));

		mostrarConfiguracion(scanner, "CONFIGURACION 7 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionOchoA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));
		scanner.agregarDestinoAProcesar(new Destino(10, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 8 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionOchoB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(10, "A"));
		scanner.agregarDestinoAProcesar(new Destino(10, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(10, "D"));
		scanner.agregarDestinoAProcesar(new Destino(10, "E"));
		scanner.agregarDestinoAProcesar(new Destino(10, "F"));
		scanner.agregarDestinoAProcesar(new Destino(10, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(10, "I"));
		scanner.agregarDestinoAProcesar(new Destino(10, "J"));
		scanner.agregarDestinoAProcesar(new Destino(10, "K"));
		scanner.agregarDestinoAProcesar(new Destino(10, "L"));
		scanner.agregarDestinoAProcesar(new Destino(10, "M"));
		scanner.agregarDestinoAProcesar(new Destino(10, "N"));
		scanner.agregarDestinoAProcesar(new Destino(10, "O"));
		scanner.agregarDestinoAProcesar(new Destino(10, "P"));
		scanner.agregarDestinoAProcesar(new Destino(10, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(10, "R"));
		scanner.agregarDestinoAProcesar(new Destino(10, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 8 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionNueveA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 9 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionNueveB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));

		mostrarConfiguracion(scanner, "CONFIGURACION 9 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionDiezA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));
		scanner.agregarDestinoAProcesar(new Destino(200, "T"));

		mostrarConfiguracion(scanner, "CONFIGURACION 10 SIN TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionDiezB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(60, "A"));
		scanner.agregarDestinoAProcesar(new Destino(20, "B"));
		scanner.agregarDestinoAProcesar(new Destino(10, "C"));
		scanner.agregarDestinoAProcesar(new Destino(40, "D"));
		scanner.agregarDestinoAProcesar(new Destino(80, "E"));
		scanner.agregarDestinoAProcesar(new Destino(900, "F"));
		scanner.agregarDestinoAProcesar(new Destino(50, "G"));
		scanner.agregarDestinoAProcesar(new Destino(10, "H"));
		scanner.agregarDestinoAProcesar(new Destino(400, "I"));
		scanner.agregarDestinoAProcesar(new Destino(450, "J"));
		scanner.agregarDestinoAProcesar(new Destino(200, "K"));
		scanner.agregarDestinoAProcesar(new Destino(1200, "L"));
		scanner.agregarDestinoAProcesar(new Destino(1000, "M"));
		scanner.agregarDestinoAProcesar(new Destino(50, "N"));
		scanner.agregarDestinoAProcesar(new Destino(90, "O"));
		scanner.agregarDestinoAProcesar(new Destino(500, "P"));
		scanner.agregarDestinoAProcesar(new Destino(30, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(120, "R"));
		scanner.agregarDestinoAProcesar(new Destino(300, "S"));
		scanner.agregarDestinoAProcesar(new Destino(200, "T"));

		mostrarConfiguracion(scanner, "CONFIGURACION 10 CON TIEMPO DE SETUP");

		return scanner;

	}

	public static PasadaPorScanner configuracionOnceA() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(100, "A"));
		scanner.agregarDestinoAProcesar(new Destino(100, "B"));
		scanner.agregarDestinoAProcesar(new Destino(100, "C"));
		scanner.agregarDestinoAProcesar(new Destino(100, "D"));
		scanner.agregarDestinoAProcesar(new Destino(100, "E"));
		scanner.agregarDestinoAProcesar(new Destino(100, "F"));
		scanner.agregarDestinoAProcesar(new Destino(100, "G"));
		scanner.agregarDestinoAProcesar(new Destino(100, "H"));
		scanner.agregarDestinoAProcesar(new Destino(100, "I"));
		scanner.agregarDestinoAProcesar(new Destino(100, "J"));
		scanner.agregarDestinoAProcesar(new Destino(100, "K"));
		scanner.agregarDestinoAProcesar(new Destino(100, "L"));
		scanner.agregarDestinoAProcesar(new Destino(100, "M"));
		scanner.agregarDestinoAProcesar(new Destino(100, "N"));
		scanner.agregarDestinoAProcesar(new Destino(100, "O"));
		scanner.agregarDestinoAProcesar(new Destino(100, "P"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(100, "R"));
		scanner.agregarDestinoAProcesar(new Destino(100, "S"));
		scanner.agregarDestinoAProcesar(new Destino(100, "T"));
		scanner.agregarDestinoAProcesar(new Destino(100, "U"));

		mostrarConfiguracion(scanner, "CONFIGURACION 11 SIN TIEMPO DE SETUP");

		return scanner;
	}

	public static PasadaPorScanner configuracionOnceB() {

		Double destinosPorPasdas = 4.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(100, "A"));
		scanner.agregarDestinoAProcesar(new Destino(100, "B"));
		scanner.agregarDestinoAProcesar(new Destino(100, "C"));
		scanner.agregarDestinoAProcesar(new Destino(100, "D"));
		scanner.agregarDestinoAProcesar(new Destino(100, "E"));
		scanner.agregarDestinoAProcesar(new Destino(100, "F"));
		scanner.agregarDestinoAProcesar(new Destino(100, "G"));
		scanner.agregarDestinoAProcesar(new Destino(100, "H"));
		scanner.agregarDestinoAProcesar(new Destino(100, "I"));
		scanner.agregarDestinoAProcesar(new Destino(100, "J"));
		scanner.agregarDestinoAProcesar(new Destino(100, "K"));
		scanner.agregarDestinoAProcesar(new Destino(100, "L"));
		scanner.agregarDestinoAProcesar(new Destino(100, "M"));
		scanner.agregarDestinoAProcesar(new Destino(100, "N"));
		scanner.agregarDestinoAProcesar(new Destino(100, "O"));
		scanner.agregarDestinoAProcesar(new Destino(100, "P"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(100, "R"));
		scanner.agregarDestinoAProcesar(new Destino(100, "S"));
		scanner.agregarDestinoAProcesar(new Destino(100, "T"));
		scanner.agregarDestinoAProcesar(new Destino(100, "U"));

		mostrarConfiguracion(scanner, "CONFIGURACION 11 CON TIEMPO DE SETUP");

		return scanner;
	}

	public static PasadaPorScanner configuracionDoceA() {

		Double destinosPorPasdas = 9.0;
		Double tiempoSetup = 0.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(100, "A"));
		scanner.agregarDestinoAProcesar(new Destino(100, "B"));
		scanner.agregarDestinoAProcesar(new Destino(100, "C"));
		scanner.agregarDestinoAProcesar(new Destino(100, "D"));
		scanner.agregarDestinoAProcesar(new Destino(100, "E"));
		scanner.agregarDestinoAProcesar(new Destino(100, "F"));
		scanner.agregarDestinoAProcesar(new Destino(100, "G"));
		scanner.agregarDestinoAProcesar(new Destino(100, "H"));
		scanner.agregarDestinoAProcesar(new Destino(100, "I"));
		scanner.agregarDestinoAProcesar(new Destino(100, "J"));
		scanner.agregarDestinoAProcesar(new Destino(100, "K"));
		scanner.agregarDestinoAProcesar(new Destino(100, "L"));
		scanner.agregarDestinoAProcesar(new Destino(100, "M"));
		scanner.agregarDestinoAProcesar(new Destino(100, "N"));
		scanner.agregarDestinoAProcesar(new Destino(100, "O"));
		scanner.agregarDestinoAProcesar(new Destino(100, "P"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(100, "R"));
		scanner.agregarDestinoAProcesar(new Destino(100, "S"));
		scanner.agregarDestinoAProcesar(new Destino(100, "T"));
		scanner.agregarDestinoAProcesar(new Destino(100, "U"));
		scanner.agregarDestinoAProcesar(new Destino(100, "V"));
		scanner.agregarDestinoAProcesar(new Destino(100, "W"));
		scanner.agregarDestinoAProcesar(new Destino(100, "X"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Y"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Z"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AA"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AB"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AC"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AD"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AE"));

		mostrarConfiguracion(scanner, "CONFIGURACION 12 SIN TIEMPO DE SETUP");

		return scanner;
	}

	public static PasadaPorScanner configuracionDoceB() {

		Double destinosPorPasdas = 9.0;
		Double tiempoSetup = 100.0;
		Double tiempoProcesamientoPorCaja = 1.0;

		PasadaPorScanner scanner = PasadaPorScanner.crearPasadaPorScanner(destinosPorPasdas, tiempoSetup,
				tiempoProcesamientoPorCaja);
		scanner.agregarDestinoAProcesar(new Destino(100, "A"));
		scanner.agregarDestinoAProcesar(new Destino(100, "B"));
		scanner.agregarDestinoAProcesar(new Destino(100, "C"));
		scanner.agregarDestinoAProcesar(new Destino(100, "D"));
		scanner.agregarDestinoAProcesar(new Destino(100, "E"));
		scanner.agregarDestinoAProcesar(new Destino(100, "F"));
		scanner.agregarDestinoAProcesar(new Destino(100, "G"));
		scanner.agregarDestinoAProcesar(new Destino(100, "H"));
		scanner.agregarDestinoAProcesar(new Destino(100, "I"));
		scanner.agregarDestinoAProcesar(new Destino(100, "J"));
		scanner.agregarDestinoAProcesar(new Destino(100, "K"));
		scanner.agregarDestinoAProcesar(new Destino(100, "L"));
		scanner.agregarDestinoAProcesar(new Destino(100, "M"));
		scanner.agregarDestinoAProcesar(new Destino(100, "N"));
		scanner.agregarDestinoAProcesar(new Destino(100, "O"));
		scanner.agregarDestinoAProcesar(new Destino(100, "P"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Q"));
		scanner.agregarDestinoAProcesar(new Destino(100, "R"));
		scanner.agregarDestinoAProcesar(new Destino(100, "S"));
		scanner.agregarDestinoAProcesar(new Destino(100, "T"));
		scanner.agregarDestinoAProcesar(new Destino(100, "U"));
		scanner.agregarDestinoAProcesar(new Destino(100, "V"));
		scanner.agregarDestinoAProcesar(new Destino(100, "W"));
		scanner.agregarDestinoAProcesar(new Destino(100, "X"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Y"));
		scanner.agregarDestinoAProcesar(new Destino(100, "Z"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AA"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AB"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AC"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AD"));
		scanner.agregarDestinoAProcesar(new Destino(100, "AE"));

		mostrarConfiguracion(scanner, "CONFIGURACION 12 CON TIEMPO DE SETUP");

		return scanner;
	}

	public static void mostrarConfiguracion(PasadaPorScanner pasadaPorScanner, String nombreConfiguracion) {
		System.out.println("CONFIGURACION: " + nombreConfiguracion + "\n");
		System.out.println("tiempo setup de scanner: " + pasadaPorScanner.getTiempoSetup());
		System.out.println("tiempo procesamiento por caja: " + pasadaPorScanner.getTiempoProcesamintoPorCaja());
		System.out
				.println("cantidad de destinos por pasadas: " + pasadaPorScanner.getCantidadDestinosPorPasada() + "\n");
		System.out.println("CODIGOS POSTALES CARGADOS: \n");

		for (Destino destino : pasadaPorScanner.getDestinos()) {
			System.out.println(destino.getCodigoPostal() + " con cantidad de cajas: " + destino.getCantidadCajas());
		}

	}

	public static PasadaPorScanner seleccionarConfiguracion(String[] configuracion) {

		try {

			switch (Integer.parseInt(configuracion[0])) {
			case 1:
				return Configuraciones.configuracionUnoA();
			case 2:
				return Configuraciones.configuracionUnoB();
			case 3:
				return Configuraciones.configuracionDosA();
			case 4:
				return Configuraciones.configuracionDosB();
			case 5:
				return Configuraciones.configuracionTresA();
			case 6:
				return Configuraciones.configuracionTresB();
			case 7:
				return Configuraciones.configuracionCuatroA();
			case 8:
				return Configuraciones.configuracionCuatroB();
			case 9:
				return Configuraciones.configuracionCincoA();
			case 10:
				return Configuraciones.configuracionCincoB();
			case 11:
				return Configuraciones.configuracionSeisA();
			case 12:
				return Configuraciones.configuracionSeisB();
			case 13:
				return Configuraciones.configuracionSieteA();
			case 14:
				return Configuraciones.configuracionSieteB();
			case 15:
				return Configuraciones.configuracionOchoA();
			case 16:
				return Configuraciones.configuracionOchoB();
			case 17:
				return Configuraciones.configuracionNueveA();
			case 18:
				return Configuraciones.configuracionNueveB();

			case 19:
				return Configuraciones.configuracionDiezA();
			case 20:
				return Configuraciones.configuracionDiezB();
			case 21:
				return Configuraciones.configuracionOnceA();
			case 22:
				return Configuraciones.configuracionOnceB();
			case 23:
				return Configuraciones.configuracionDoceA();
			case 24:
				return Configuraciones.configuracionDoceB();
			default:
				return Configuraciones.configuracionUnoA();

			}
		} catch (Exception e) {
			return Configuraciones.configuracionUnoA();
		}

	}

}
