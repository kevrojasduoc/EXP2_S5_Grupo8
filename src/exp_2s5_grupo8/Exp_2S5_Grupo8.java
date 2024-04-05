package exp_2s5_grupo8;
//grupo8
import java.util.Scanner;
import java.util.ArrayList;

public class Exp_2S5_Grupo8 {
    
    public class PreciosTeatro{
        public static int precioEntrVip = 20000;
        public static int precioEntrPlat = 15000;
        public static int precioEntrGnrl = 10000;
        public static int totalEntradasVend = 0;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> entradasTeatro = new ArrayList<>();
        
        boolean salir=false;
        String entrVip = "VIP";
        String entrPlat = "Platea";
        String entrGnrl = "General";
        
        int descEst = 10;
        int descTerEdad = 15;
        int totalIngresos = 0;
        
        while(!salir){
            System.out.println("""
                               [1] Venta de Entradas
                               [2] Mostrar Entradas
                               [3] Buscar Entrada
                               [4] Eliminar Entrada
                               [5] Ver total de entradas y ventas
                               [0] Salir del sistema
                               Ingresar opcion:""");
            int opmenu = scanner.nextInt();
            switch (opmenu){
                case 1 -> { //Venta de Entradas                   
                    System.out.println("[1] " + entrVip);
                    System.out.println("[2] " + entrPlat);
                    System.out.println("[3] " + entrGnrl);
                    int tipoEntrada = scanner.nextInt();
                    switch (tipoEntrada){ //entrada VIP
                        case 1-> {
                            System.out.println("Ha seleccionado la entrada " + entrVip + " Precio: " + PreciosTeatro.precioEntrVip);
                            System.out.println("""
                                   [1] Promocion Estudiante Descuento 10%
                                   [2] Promocion Tercera Edad Descuento 15%
                                   [3] Continuar sin promociones
                                   Ingresar la promocion que desea obtener: """);                      
                            int tipoPromo = scanner.nextInt();
                            if (tipoPromo == 1){
                               System.out.println("Descuento de Estudiante de un 10%");
                               int precioFinal = PreciosTeatro.precioEntrVip - (descEst*PreciosTeatro.precioEntrVip)/100;
                               System.out.println("Precio final " + precioFinal);
                                System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                int confirmarEntr = scanner.nextInt();
                                if (confirmarEntr == 1){
                                    System.out.println("Venta registrada en el sistema");
                                    entradasTeatro.add("Entrada " + entrVip +  " Estudiante " + precioFinal);
                                    totalIngresos += precioFinal;                                   
                                }else{
                                    System.out.println("Entrada no confirmada...");
                                }      
                            }else if(tipoPromo == 2){
                                System.out.println("Descuento para tercera edad, favor ingrese edad: ");
                                int edad = scanner.nextInt();
                                if (edad >= 65){
                                    System.out.println("Se valida cliente de tercera edad...");
                                    int precioFinal = PreciosTeatro.precioEntrVip - (descTerEdad*PreciosTeatro.precioEntrVip)/100;
                                    System.out.println("Precio final " + precioFinal);
                                    System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                    int confirmarEntr = scanner.nextInt();
                                    if (confirmarEntr == 1){
                                        System.out.println("Venta registrada en el sistema");
                                        entradasTeatro.add("Entrada " + entrVip +  " Tercera Edad " + precioFinal);
                                        totalIngresos += precioFinal;                                   
                                    }else{
                                        System.out.println("Entrada no confirmada...");
                                    }      
                                }else{
                                    System.out.println("Entrada no confirmada...");
                                }
                            }else if (tipoPromo == 3){
                                System.out.println("Entrada sin promocion");
                                System.out.println("Precio: " + PreciosTeatro.precioEntrVip);
                                System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                    int confirmarEntr = scanner.nextInt();
                                    if (confirmarEntr == 1){
                                        System.out.println("Venta registrada en el sistema");
                                        entradasTeatro.add("Entrada " + entrVip +  " Entrada Normal " + PreciosTeatro.precioEntrVip);
                                        totalIngresos += PreciosTeatro.precioEntrVip;                                   
                                    }else{
                                        System.out.println("Entrada no confirmada...");
                                    }      
                            }
                            else{
                               System.out.println("Ingrese los datos correctos...");
                            }  
                        }//end case 1 sw tipo entrada
                        case 2->{
                            System.out.println("Ha seleccionado la entrada " + entrPlat + " Precio: " + PreciosTeatro.precioEntrPlat);
                            System.out.println("""
                                   [1] Promocion Estudiante Descuento 10%
                                   [2] Promocion Tercera Edad Descuento 15%
                                   [3] Continuar sin promociones
                                   Ingresar la promocion que desea obtener: """);                      
                            int tipoPromo = scanner.nextInt();
                            if (tipoPromo == 1){
                               System.out.println("Descuento de Estudiante de un 10%");
                               int precioFinal = PreciosTeatro.precioEntrPlat - (descEst*PreciosTeatro.precioEntrPlat)/100;
                               System.out.println("Precio final " + precioFinal);
                                System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                int confirmarEntr = scanner.nextInt();
                                if (confirmarEntr == 1){
                                    System.out.println("Venta registrada en el sistema");
                                    entradasTeatro.add("Entrada " + entrPlat +  " Estudiante " + precioFinal);
                                    totalIngresos += precioFinal;                                   
                                }else{
                                    System.out.println("Entrada no confirmada...");
                                }      
                            }else if(tipoPromo == 2){
                                System.out.println("Descuento para tercera edad, favor ingrese edad: ");
                                int edad = scanner.nextInt();
                                if (edad >= 65){
                                    System.out.println("Se valida cliente de tercera edad...");
                                    int precioFinal = PreciosTeatro.precioEntrPlat - (descTerEdad*PreciosTeatro.precioEntrPlat)/100;
                                    System.out.println("Precio final " + precioFinal);
                                    System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                    int confirmarEntr = scanner.nextInt();
                                    if (confirmarEntr == 1){
                                        System.out.println("Venta registrada en el sistema");
                                        entradasTeatro.add("Entrada " + entrPlat +  " Tercera Edad " + precioFinal);
                                        totalIngresos += precioFinal;                                   
                                    }else{
                                        System.out.println("Entrada no confirmada...");
                                    }      
                                }else{
                                    System.out.println("Entrada no confirmada...");
                                }
                            }else if (tipoPromo == 3){
                                System.out.println("Entrada sin promocion");
                                System.out.println("Precio: " + PreciosTeatro.precioEntrPlat);
                                System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                    int confirmarEntr = scanner.nextInt();
                                    if (confirmarEntr == 1){
                                        System.out.println("Venta registrada en el sistema");
                                        entradasTeatro.add("Entrada " + entrPlat +  " Entrada Normal " + PreciosTeatro.precioEntrPlat);
                                        totalIngresos += PreciosTeatro.precioEntrPlat;                                   
                                    }else{
                                        System.out.println("Entrada no confirmada...");
                                    }      
                            }
                            else{
                               System.out.println("Ingrese los datos correctos...");
                            }  
                        }//end case 2 sw tipo entrada
                        case 3 -> {
                            System.out.println("Ha seleccionado la entrada " + entrGnrl + " Precio: " + PreciosTeatro.precioEntrGnrl);
                            System.out.println("""
                                   [1] Promocion Estudiante Descuento 10%
                                   [2] Promocion Tercera Edad Descuento 15%
                                   [3] Continuar sin promociones
                                   Ingresar la promocion que desea obtener: """);                      
                            int tipoPromo = scanner.nextInt();
                            if (tipoPromo == 1){
                               System.out.println("Descuento de Estudiante de un 10%");
                               int precioFinal = PreciosTeatro.precioEntrGnrl - (descEst*PreciosTeatro.precioEntrGnrl)/100;
                               System.out.println("Precio final " + precioFinal);
                                System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                int confirmarEntr = scanner.nextInt();
                                if (confirmarEntr == 1){
                                    System.out.println("Venta registrada en el sistema");
                                    entradasTeatro.add("Entrada " + entrGnrl +  " Estudiante " + precioFinal);
                                    totalIngresos += precioFinal;                                   
                                }else{
                                    System.out.println("Entrada no confirmada...");
                                }      
                            }else if(tipoPromo == 2){
                                System.out.println("Descuento para tercera edad, favor ingrese edad: ");
                                int edad = scanner.nextInt();
                                if (edad >= 65){
                                    System.out.println("Se valida cliente de tercera edad...");
                                    int precioFinal = PreciosTeatro.precioEntrGnrl - (descTerEdad*PreciosTeatro.precioEntrGnrl)/100;
                                    System.out.println("Precio final " + precioFinal);
                                    System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                    int confirmarEntr = scanner.nextInt();
                                    if (confirmarEntr == 1){
                                        System.out.println("Venta registrada en el sistema");
                                        entradasTeatro.add("Entrada " + entrGnrl +  " Tercera Edad " + precioFinal);
                                        totalIngresos += precioFinal;                                   
                                    }else{
                                        System.out.println("Entrada no confirmada...");
                                    }      
                                }else{
                                    System.out.println("Entrada no confirmada...");
                                }
                            }else if (tipoPromo == 3){
                                System.out.println("Entrada sin promocion");
                                System.out.println("Precio: " + PreciosTeatro.precioEntrGnrl);
                                System.out.println("Confirmar Venta de Entrada: [1] Si | [2] No");
                                    int confirmarEntr = scanner.nextInt();
                                    if (confirmarEntr == 1){
                                        System.out.println("Venta registrada en el sistema");
                                        entradasTeatro.add("Entrada " + entrGnrl +  " Entrada Normal " + PreciosTeatro.precioEntrGnrl);
                                        totalIngresos += PreciosTeatro.precioEntrGnrl;                                   
                                    }else{
                                        System.out.println("Entrada no confirmada...");
                                    }      
                            }
                            else{
                               System.out.println("Ingrese los datos correctos...");
                            }  
                        }
                        default -> System.out.println("Ingrese una opcion valida..");
                    }//end switch tipo entrada       
                }//end case 1
                case 2 -> { //Mostrar las entradas vendidas con id
                    System.out.println("Entradas Vendidas");
                    for (int i=0; i< entradasTeatro.size();i++){ 
                        System.out.println((i + 1) + ":" + entradasTeatro.get(i)); 
                    } 
                }//end case 2
                case 3 -> { //Buscar las entradas vendidas por el id
                    System.out.println("Ingresar el identificador de Entrada que desea buscar: ");
                    int entradaId = scanner.nextInt();
                    if (entradaId < entradasTeatro.size()){
                        String encontrarEntrada = entradasTeatro.get(entradaId -1);
                        System.out.println(encontrarEntrada);
                }
                }//end case 3
                case 4 -> {
                    System.out.println("Eliminar entrada");
                    System.out.println("Ingrese el Id de la entrada para eliminar: ");
                    int eliminarEntr = scanner.nextInt();
                    if (eliminarEntr >=1 && eliminarEntr <= entradasTeatro.size()){
                            entradasTeatro.remove(eliminarEntr -1);
                            System.out.println("Entrada eliminada...");                       
                    }else{
                        System.out.println("Verifique que el Id de la entrada exista en el sistema!");
                    }    
                }
                case 5 -> {
                    PreciosTeatro.totalEntradasVend=entradasTeatro.size();
                    System.out.println("Total de entradas vendidas: " + PreciosTeatro.totalEntradasVend);
                    System.out.println("Total de ventas: " + totalIngresos);
                }
                case 0 -> {
                    System.out.println("Saliendo del sistema...");
                    salir=true;
                }
                default -> System.out.println("Ingrese una opcion valida..");
            }//end switch op menu
        }//end while menu   
    }//end main
}//end class