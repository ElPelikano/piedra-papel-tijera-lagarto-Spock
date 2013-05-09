package edu.tallerweb.pptls;

/**
 * Representa una de las Manos involucradas en el juego
 */
public class Mano {
	
	Forma manoForma;
	
	/**
	 * Toda Mano debe crearse con una forma dada, que será
	 * la que determine su condición en el juego.
	 * @param forma, la Forma que adopta la Mano.
	 */
	public Mano(final Forma forma) {
		//throw new RuntimeException("No implementado aún");
		
		manoForma = forma;
	}

	/**
	 * Evaluará el resultado de la partida según las reglas
	 * del juego.
	 * @param otra, la otra Mano.
	 * @return un Resultado, de acuerdo al estado del juego.
	 */
	public Resultado jugarCon(final Mano otra) {
		//throw new RuntimeException("No implementado aún");
		
		System.out.print(getResultadoJugada(otra));
		
	}
	
	private String getResultadoJugada(Forma otra)
	{
		Resultado resultadoPartida[][] = new Resultado [5][5];
		
		// Jugadas con que la Mano gana.
		resultadoPartida[4][2] = Resultado.GANA;
		resultadoPartida[2][0] = Resultado.GANA;
		resultadoPartida[0][3] = Resultado.GANA;
		resultadoPartida[3][1] = Resultado.GANA;
		resultadoPartida[1][4] = Resultado.GANA;
		resultadoPartida[4][3] = Resultado.GANA;
		resultadoPartida[3][2] = Resultado.GANA;
		resultadoPartida[2][1] = Resultado.GANA;
		resultadoPartida[1][0] = Resultado.GANA;
		resultadoPartida[0][4] = Resultado.GANA;
		
		// Jugadas con que la Mano pierde.
		resultadoPartida[2][4] = Resultado.PIERDE;
		resultadoPartida[0][2] = Resultado.PIERDE;
		resultadoPartida[3][0] = Resultado.PIERDE;
		resultadoPartida[1][3] = Resultado.PIERDE;
		resultadoPartida[4][1] = Resultado.PIERDE;
		resultadoPartida[3][4] = Resultado.PIERDE;
		resultadoPartida[2][3] = Resultado.PIERDE;
		resultadoPartida[1][2] = Resultado.PIERDE;
		resultadoPartida[0][1] = Resultado.PIERDE;
		resultadoPartida[4][0] = Resultado.PIERDE;
		
		// Empate
		resultadoPartida[0][0] = Resultado.EMPATA;
		resultadoPartida[1][1] = Resultado.EMPATA;
		resultadoPartida[2][2] = Resultado.EMPATA;
		resultadoPartida[3][3] = Resultado.EMPATA;
		resultadoPartida[4][4] = Resultado.EMPATA;
		
		return resultadoPartida[this.manoForma][otra];
		
	}
	
}
