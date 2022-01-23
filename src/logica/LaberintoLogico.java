package logica;

import interfaz.VentanaLaberinto;

public class LaberintoLogico 
{
	 public char[][] laberinto={ 
		        {'#', '#', '#', '#', '#', '#'},
			    {'#', ' ', ' ', ' ', ' ', '#'},
			    {'#', '#', ' ', '#', ' ', '#'},
			    {'#', ' ', ' ', ' ', ' ', '#'},
			    {'#', ' ', '#', ' ', '#', '#'},
			    {'#', '#', '#', '#', '#', '#'},
	 };
	public VentanaLaberinto vl;
	LaberintoLogico ll;
	public LaberintoLogico(int x, int y, int a, int b)
	{
//		ll = new LaberintoLogico(x, y, a, b);
		menuLab(x, y, a, b);
	}
	public void menuLab(int x, int y, int a, int b)
	{
		laberinto[x][y] = 'X'; 
		resuelve(a, b);
		imprimir();
	}
	public void resuelve(int x, int y)
	{
		if (paso(x, y)) { 								// intentará resolver el laberinto en estas coordenadas
            laberinto[x][y] = 'S'; 						// introduce en las coordenadas (x, y) la entrada
	    }
	}
	public boolean paso(int x, int y) 
    {

    	 if (laberinto[x][y]=='X')
    	 { // si hemos llegado a X quiere decir que hemos encontrado solución
    		 return true; // luego, el algoritmo termina
    	 }
    	 
    	 
    	 if (laberinto[x][y]=='#'||laberinto[x][y]=='*') 
    	 { // si llegamos a una pared o al mismo punto,
    		 return false; // entonces el laberinto no puede resolverse y termina.
    	 }
    	 
    	 // si no se cumple ninguna de estas dos situaciones, quiere decir que nos encontramos en un
    	 // caso intermedio, por lo tanto, que empezamos a recorrer o todavía no hemos llegado a nada
    	 laberinto[x][y]='*'; // marcamos la posición como visitada (si es la primera, en las coordenadas x e y 
    	 
    	 boolean result; // se coloca S de START)
    
    	 result=paso(x-1, y); // intentamos ir hacia ARRIBA. Segunda llamada recursiva
    	 
    	 if (result) return true; // si el resultado es el final, entonces el algoritmo termina
    	 result=paso(x, y+1); // intentamos ir hacia la DERECHA. Primera llamada recursiva
    	 
    	 if (result) return true; // si el resultado es el final, entonces el algoritmo termina
    	 result=paso(x, y-1); // intentamos ir hacia la IZQUIERDA. Tercera llamada recursiva
    	 
    	 if (result) return true; // si el resultado es el final, entonces el algoritmo termina
    	 result=paso(x+1, y); // intentamos ir hacia ABAJO. Cuarta llamada recursiva
    	 
    	 if (result) return true; // si el resultado es el final, entonces el algoritmo termina
    		    // si no hemos encontrado la solución en estos cuatros movimientos, volvemos atrás, aunque hay que
    	        // considerar que en este punto, todas las llamadas recursivas han finalizado. Si en ninguna de ellas
    	        // se ha conseguido el éxito, entonces el algoritmo termina y devuelve false.
    		    laberinto[x][y]='+'; // en el caso de no ser el resultado, se marca con +. Ya fue pisado
    		    return false; // vuelta atrás si la solución no se encuentra aquí
    	
       
    }
	 public char[][] imprimir() { // imprimiremos nuestra solución. Debido a que la clase Arrays no tiene implementado
//	        vl = new VentanaLaberinto();
//	        vl.imprime(laberinto);
		 System.out.println(laberinto[0][0]+"   "+laberinto[1][1]);
		 return laberinto;
	    }
}
