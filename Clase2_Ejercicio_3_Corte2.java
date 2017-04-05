
import java.io.*;

public class Clase2_Ejercicio_3_Corte2 
{
    public static void main(String[] args)throws IOException
    {
        String valor;
        int p,m,t,s,r,c;
        
        //a=m b=t c=s d=r e=0      
        
        p=0;m=0;t=0;s=0;r=0;c=0;
        
        BufferedReader Entrada=new BufferedReader (new InputStreamReader (System.in));
        
        
        while(m<4)
        {
            
        System.out.println("1 - Ingrese un dato : ");
        System.out.println("2 - Par / Impar");
        System.out.println("3 - Primo / No Primo");
        System.out.println("4 - Salir");
        
        //valor=Entrada.readLine();
        //opc=Integer.parseInt(valor);
        
        switch (m)
        {
            case 1:
            {
                System.out.println("Ingrese un Dato : ");
                valor=Entrada.readLine();
                m=Integer.parseInt(valor);
            }
            break;
                
            case 2:
            {
                p=m%2;
                if(p==0)
                    System.out.println("El numero es PAR");
                else
                    System.out.println("El Numero es impar");
              
            }
            break;
            
            case 3:
            {
                if((m==1)||(m==2)||(m==3))
                {
                    System.out.println("El numero es PRIMO");
                      
                }
                else
                {
                    r=m%2;
                    if(r==1)
                    {
                        t=m-1;
                        for(c=2;c==t;c++)
                        {
                            r=m%2;
                            if(r==0)
                            {
                                s=1;
                            }
                        }
                        if(s==0)
                        {
                            System.out.println("es numero Primo");
                        }
                        else
                            System.out.println("El numero No es Primo");
                    }
                    else
                        System.out.println("No es primo");
                }
            
                
            }
            break;
            
            case 4: System.out.println("Saliendo del programa");
            
            break;
            
            default: 
            {
                System.out.println("Errores diferentes");
                
            }
            break;
            
        }    
            
        }       
        
        
    }
    
}
