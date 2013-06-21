import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;


public class main {
	
	/*.pop() extrae muestra y elimina
	 * .peek() muestra el valor que se encuentra al final, es decir el primero que va salir.
	*/
		
	public static void main(String[] args) {    
		// TODO Auto-generated method stub
		Stack pilacaracter = new Stack();
		char caracter;
		int recorrecadena = 0;
		boolean valida = true, cerrar = true;
		int EstadoAceptacion = 3,Estadotemp=1;
		
		
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese la cadena");
		String cadena = leer.nextLine();
		
		
		
		while(recorrecadena < cadena.length()){
			
			caracter = cadena.charAt(recorrecadena);
			System.out.println(caracter+"SSS");
			
			if(recorrecadena==0){
				
				switch(caracter){
				
					case '+': case'*': case '-': case '/':
						
						//System.out.println("Invalido lol");
					
						cerrar=false;
					break;
				}	
			}
			
			switch(caracter){
				
			case ')':	
						if(Estadotemp==1){
							System.out.println("entro");
							
							recorrecadena= 10000;						
							
							System.out.println(pilacaracter.empty());
							valida = false;
							
						}
						switch(Estadotemp){
						
						case 2:case 3:case 5:								
								
								if(Estadotemp==2){
									Estadotemp=3;
									
								
									if(recorrecadena == 0){
										recorrecadena= 10000;						
										
										System.out.println(pilacaracter.empty());
										valida = false;
										
									}else{								
											
											if(pilacaracter.empty()){
												recorrecadena++;
												valida = false;
												
											}else{
												
												pilacaracter.pop();
												recorrecadena++;									
												
											}												
									}
									
									
								}else{
									if(Estadotemp==3){
										Estadotemp=3;
										
										
										
										if(recorrecadena == 0){
											recorrecadena= 10000;						
											
											System.out.println(pilacaracter.empty());
											valida = false;
											
										}else{								
												
												if(pilacaracter.empty()){
													recorrecadena++;
													valida = false;
													
												}else{
													
													pilacaracter.pop();
													recorrecadena++;									
													
												}												
										}
										
									
									}else{
										
										if(Estadotemp==5){
											Estadotemp=3;
											
											if(recorrecadena == 0){
												recorrecadena= 10000;						
												
												System.out.println(pilacaracter.empty());
												valida = false;
												
											}else{								
													
													if(pilacaracter.empty()){
														recorrecadena++;
														valida = false;
														
													}else{
														
														pilacaracter.pop();
														recorrecadena++;									
														
													}												
											}
										}
									
									}
								}
							break;
						
						}
				break;
				
			case '(':			
						switch(Estadotemp){
						
						case 1: case 2: case 4:
							if(Estadotemp==1)
							{
								
								Estadotemp=2;
								
								pilacaracter.push(caracter);
								recorrecadena++;
								
							}else{
								if(Estadotemp==2){
									Estadotemp=2;
									
									pilacaracter.push(caracter);
									recorrecadena++;
								}else
								{
									if(Estadotemp==4){
										Estadotemp=2;
										
										pilacaracter.push(caracter);
										recorrecadena++;
									}
									
								}
							}
							
							break;
							default:							
									
									recorrecadena=1000;
									valida=false;								
								
								break;
						}
				break;
			case 'A':case 'B':case 'C':case 'D':case 'E':case 'F':case 'G':case 'H':case 'I':case 'J':case 'K':case 'L':case 'M':case 'N':case 'Ñ':case 'O':case 'P':case'Q':case 'R':case 'S':case 'T':case 'U':case 'V':case 'W':case 'X': case 'Y':case'Z':
				
				if(Estadotemp==1){
					
					Estadotemp=5;
					
					recorrecadena++;
					
				}else{
					
					if(Estadotemp==2){
						
						Estadotemp = 5;
						
						recorrecadena++;
					}else{
						
						if(Estadotemp==4){
						
							Estadotemp=3;
							
							recorrecadena++;
						}
						else{
							
							recorrecadena++;
						}
					}
				}
				
				break;
				
			case '*':case '+':case '-':case '/':
				
						//System.out.println("entre");
						
						if(Estadotemp==5){
							
							Estadotemp=1;
							
							recorrecadena++;
						}
						else{
							if(Estadotemp==3){
								
								Estadotemp=4;
								
								recorrecadena++;
							}
							else{
								recorrecadena=1000;
								valida= false;
								
							}
						}				
				break;
			default:
						
				break;
			}
		}
		
		System.out.println(EstadoAceptacion +"->"+Estadotemp);
		
		if(cerrar == true){
			
			if(pilacaracter.empty() ){
				
				if(!valida){
					
					System.out.println("cadena Incorrecta");
				}
				else
				{
					if(Estadotemp==EstadoAceptacion){
						
						System.out.println("Cadena Correcta");
						
					}					
				}
				
			}
			else{
				System.out.println("Cadena Incorrecta ");
			}
			
		}else{
			
			if(cerrar==false){
				
				System.out.println("cadena incorrecta");
			}
		}
	}

}
