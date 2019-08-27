
public class EjercicioDejean {
	
		public static void main(String[] args) {
			
			Complejos z1=new Complejos(10,20);
			Complejos z2=new Complejos(20,50);
			Complejos z3=new Complejos(10,20);
			
	

			//CREAR VECTOR 
			Complejos [] v_complejo=new Complejos[10];
			
		//cargar verctor de objetos
			
				int i;
				for (i=0;i<v_complejo.length;i++) {
					v_complejo [i]=new Complejos(i*2,i*2+1);
				}
				
		//mostramos los modulos del vector
				for(i=0;i<v_complejo.length;i++) {
					System.out.println(v_complejo[i].modulo(v_complejo[i]));
					
				}
			
			//MUESTRA TOSTRING DE Z1 Z2 Y Z3 
			
			System.out.println(z1.toString()+ z2.toString()+ z3.toString());
			
			//SI SON IGUALES O NO Z1 Y Z2
			
			if (z1.equals(z2)) {
				
				System.out.println(z1+" y"+z2+"SON IGUALES");
			}
			else {
				System.out.println(z1+" y"+z2+"NO SON IGUALES");
				
			}
			
			
			//SI SON IGUALES Z1 Y Z3
			
	if (z1.equals(z3)) {
				
				System.out.println(z1+" y"+z3+"SON IGUALES");
			}
			else {
				System.out.println(z1+" y"+z3+"NO SON IGUALES");
				
			}

			//METODO SUMA 
			System.out.println("LA SUMA DE DOS NUMEROS COMPLEJOS Z1 Y Z3 ES ...");
			System.out.println(z1.suma(z3));
			
			//metodo resta
			System.out.println("la resta de dos numeros complejos z2 y z3 es:  ");
			System.out.println(z2.resta(z3));
			
			//metodo multiplicar dos complejos
			System.out.println("la multiplicacion entre z1 y z3");
			System.out.println(z1.multiplicar(z3));
			
			//metodo multiplicar overload por un escalar
			System.out.println("multiplicar z1 por un escalar cualquiera en este caso dos: ");
			System.out.println(z1.Multiplicar(2));
			
			//mpdulo de un numero complejo
			System.out.println("el modulo de z1 es :");
			System.out.println(z1.modulo(z1));
			
			//modulo metodo estatico
			System.out.println("el modulo estatico de z2 es ");
			System.out.println(Complejos.moduloStatic(z2));
			
			//suma de dos complejos estaticos
			System.out.println("la suma estatica de z1 y z3 es ");
			System.out.println(Complejos.suma(z1, z3));
		}
	}

	


