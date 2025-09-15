import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
            //1
            String Nombre = "Gabriel Villar Fernández";
            String Edad = "25 años";
            System.out.println(Nombre + ", " + Edad);
            //2
            double Pi = 3.141519;
            int Radio = 5;
            System.out.println(Pi * Radio);
            //3
            int NumeroPos = 4;
            if (NumeroPos > 0) {
                System.out.println("El Número " + NumeroPos + " es positivo");
            } else {
                System.out.println("El Número " + NumeroPos + "no es positivo");
            }
            //4
            int Numero5 = 5;
            if (Numero5 > 0) {
                System.out.println("El Número " + Numero5 + " es Positivo");
            } else {
                System.out.println("El Número " + Numero5 + " es Negativo");
            }
            //5
            int Nota = 65;
            if (Nota >= 90) {
                System.out.println(Nota + " es Sobresaliente");
            } else {
                if (Nota >= 90 && Nota >= 70) {
                    System.out.println(Nota + " es Aprovado");
                } else {
                    System.out.println(Nota + " es Reprovado");
                }
            }
            //6
            int N50 = 50;
            int N60 = 60;
            if (N50 > N60) {
                System.out.println(N50 + " es mayor que " + N60);
            } else {
                if (N50 == N60) {
                    System.out.println(N50 + " es igual que " + N60);
                } else {
                    System.out.println(N50 + " es menor que " + N60);
                }
            }
            //7
            int Numpar = 9;
            if (Numpar % 2 == 0) {
                System.out.println(Numpar + (" es par"));
            } else {
                System.out.println(Numpar + " no es par");
            }
            //8
            int Edad8 = 8;
            if (Edad8 >= 18) {
                System.out.println(Edad8 + (" es mayor de edad"));
            } else {
                System.out.println(Edad8 + " es menor de edad");
            }
            //9
            int DiaSemana = 4;

            switch (DiaSemana) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sábado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Error en ejercicio 9");
            }
            //10
            int PrecioBase = 100;
            boolean Descuento = true;
            if (Descuento == true) {
                System.out.println(PrecioBase * 0.9 + "€");
            } else {
                System.out.println(PrecioBase + "€");
            }
            //2.3 idéntico a //6
            int Edad231 = 50;
            int Edad232 = 60;
            if (Edad231 > Edad232) {
                System.out.println(Edad231 + " es mayor que " + Edad232);
            } else {
                if (Edad231 == Edad232) {
                    System.out.println(Edad231 + " es igual que " + Edad232);
                } else {
                    System.out.println(Edad232 + " es mayor que " + Edad231);
                }
            }
            //2.5
            int Temperatura = 20;
            if (Temperatura > 30) {
                System.out.println("Hace calor");
            } else {
                System.out.println("Clima agradable");
            }
            //2.6
            int Numero26 = 0;
            if (Numero26 > 0) {
                System.out.println("El Número " + Numero26 + " es positivo");
            } else {
                if (Numero26 == 0) {
                    System.out.println("El Número  es 0");
                } else {
                    System.out.println("El Número " + Numero26 + " es negativo");
                }
            }
            //2.7
            int n271 = 8;
            int n272 = 90;
            int n273 = 66;
            if (n271 > n272) {
                if (n271 > n273) {
                    System.out.println("El Número " + n271 + " es el más alto");
                } else {
                    System.out.println("El Número " + n273 + " es el más alto");
                }
            } else if (n272 > n273) {
                System.out.println("El Número " + n272 + " es el más alto");
            } else {
                System.out.println("El Número " + n273 + " es el más alto");
            }
            //2.8
            int Precio28 = 150;
            if (Precio28 > 100) {
                System.out.println("Precio = " + Precio28 * 0.8 + "€");
            } else {
                System.out.println("Precio = " + Precio28 * 0.95 + "€");
            }
            //2.9
            boolean Festivo29 = true;
            if (Festivo29 = true) {
                System.out.println("Día libre");
            } else {
                System.out.println("Día laboral");
            }
            //2.10
            int num210 = 10;
            if (num210 >= 1 && num210 <= 10) {
                System.out.println(num210 + " está dentro de el rango 1-10 inclusive");
            } else {
                System.out.println(num210 + " no está dentro de el rango 1-10 inclusive");
            }
            //3.1
            int edad31 = 20;
            boolean ciudadano = true;
            if (edad31 >= 18 && ciudadano == true) {
                System.out.println("Puede votar");
            } else {
                System.out.println(num210 + "No puede votar");
            }
            //3.2
            int nota32 = 50;
            boolean asistencia32 = true;
            if (nota32 >= 60 && asistencia32 == true) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Suspenso");
            }
            //3.3
            int int33 = 55;
            if (int33 >= 50 && int33 <= 100) {
                System.out.println("Dentro del rango");
            } else {
                System.out.println("Fuera del rango");
            }
            //3.4
            String Usuario34 = "admin";
            String Contraseña34 = "1234";
            if (Usuario34 == "admin" && Contraseña34 == "1234") {
                System.out.println("Acceso permitido");
            } else {
                System.out.println("Acceso denegado");
            }
            //3.5
            int precio35 = 100;
            boolean targeta35 = true;
            if (precio35 > 200 && targeta35 == true) {
                System.out.println("Precio= " + precio35 * 0.8 + "€");
            } else if (precio35 > 200 && targeta35 == false) {
                System.out.println("Precio= " + precio35 * 0.85 + "€");
            } else {
                System.out.println("Precio= " + precio35);
            }
            //3.6 Hecho de dos formas
            int edad36 = 15;
            String grupo36 = (edad36 < 12) ? "Niño" :
                    (edad36 >= 12 && edad36 <= 17) ? "Adolescente" :
                            (edad36 >= 18 && edad36 <= 65) ? "Adulto" :
                                    (edad36 >= 65) ? "Adulto mayor" : "Error";
            System.out.println(grupo36);
            if (edad36 < 12) {
                System.out.println("Niño");
            } else if (edad36 >= 12 && edad36 <= 17) {
                System.out.println("Adolescente");
            } else if (edad36 >= 18 && edad36 < 65) {
                System.out.println("Adulto");
            } else if (edad36 > 65) {
                System.out.println("Adulto mayor");
            } else {
                System.out.println("Error");
            }
            //3.7
            int num37 = 15;
            String par37 = (num37 % 2 == 0) ? "Par " : "Impar ";
            String cinco37 = (num37 % 5 == 0) ? "múltiplo de 5" : "no múltiplo de 5";
            System.out.println(par37 + cinco37);
            //3.8
            String contraseña38 = "contraseña@";
            if (contraseña38.length() >= 8 && contraseña38.contains("@")) {
                System.out.println("Contraseña segura");
            } else {
                System.out.println("Contraseña insegura");
            }
            //3.9
            int num391 = 2;
            int num392 = 2;
            String str39 = (num391 % 2 == 0 && num392 % 2 == 0) ? "Ambos pares" :
                    (num391 % 2 != 0 && num392 % 2 != 0) ? "Ambos impares" : "Ambos diferentes";
            System.out.println(str39);
            //3.10
            int edad310 = 10;
            String str310 = (edad310 < 18) ? "Menor de edad" : "Mayor de edad";
            System.out.println(str310);
            //4.1
            System.out.print("Escribe la temperatura: ");
            int temp41 = scanner.nextInt();
            scanner.nextLine();
            String clima41 = (temp41 < 0) ? "Hace frío" : (temp41 > 30) ? "Hace calor" : "Clima templado";
            System.out.println(clima41);
            //4.2
            System.out.println("Escribe el color sin mayúsculas: ");
            String color42 = scanner.nextLine();
            String color421 = (color42.contains("azul") || color42.contains("verde") || color42.contains("rojo")) ? "Color primario!" : "Color no primario";
            System.out.println(color421);
            //4.3
            System.out.println("Escribe la velocidad: ");
            int vel43 = scanner.nextInt();
            scanner.nextLine();//Buffer
            String vel432 = (vel43 > 120) ? "Multa" : "Velocidad Correcta";
            System.out.println(vel432);
            //4.4
            System.out.println("Escribe el animal: ");
            String animal44 = scanner.nextLine();
            String animal441 = (animal44.contains("perro") || animal44.contains("gato")) ? "Domestico" : (animal44.contains("tigre") || animal44.contains("león")) ? "Salvaje" : "No clasificado";
            System.out.println(animal441);
            //4.5
            System.out.println("Escribe la edad: ");
            int edad45 = scanner.nextInt();
            scanner.nextLine();
            String edad451 = (edad45 < 12) ? "No puede entrar" : (edad45 >= 12 && edad45 <= 17) ? "Necesita adulto" : (edad45 >= 18) ? "Puede entrar solo" : "Error";
            System.out.println(edad451);
            //4.6
            System.out.println("Escribe el color de semaforo: ");
            String semafo46 = scanner.nextLine();
            String accion46 = (semafo46.contains("rojo") ? "Detente" : (semafo46.contains("amarillo")) ? "Precaución" : (semafo46.contains("verde") ? "Avanza" : "Error"));
            System.out.println(accion46);
            //4.7
            System.out.println("Escribe número secreto ");
            int numsec47 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Adivina el número secreto ");
            int num47 = scanner.nextInt();
            scanner.nextLine();
            String output47 = (numsec47 == num47) ? "Acertado!" :
                    (numsec47 > num47) ? "El número secreto es mayor" :
                            (numsec47 < num47) ? "El número secreto es menor" : "Error";
            System.out.println(output47);
            //4.8
            System.out.println("Escribe la primera palabra ");
            String palpri48 = scanner.nextLine();
            System.out.println("Escribe la segunda palabra ");
            String palseg48 = scanner.nextLine();
            String output48 = (palpri48.equals(palseg48)) ? "Coinciden" : "No coinciden";
            System.out.println(output48);
            //4.9
            int Avotes = 0;
            int Bvotes = 0;
            int Cvotes = 0;
            int i49 = 1;
            String output49 = "0";
            for (i49 = 1; i49 <= 3; i49++) {
                System.out.println("Escribe el voto " + i49 + " (A,B o C)");
                output49 = scanner.nextLine().toUpperCase();
                switch (output49) {
                    case "A":
                        Avotes++;
                        break;
                    case "B":
                        Bvotes++;
                        break;
                    case "C":
                        Cvotes++;
                        break;
                    default:
                        System.out.println("Error");
                        i49--;
                        break;
                }
            }
            String result49 = (Avotes > Bvotes && Avotes > Cvotes) ? "A ganador" : (Bvotes > Avotes && Bvotes > Cvotes) ?
                    "B ganador" : (Cvotes > Avotes && Cvotes > Bvotes) ? "C ganador" : "Empate";
            System.out.println(result49);
            System.out.println("Votos A= " + Avotes);
            System.out.println("Votos B= " + Bvotes);
            System.out.println("Votos C= " + Cvotes);
            scanner.close();
            //4.10

        System.out.println("Ingresa el primer número");
        int num4101 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa la operación(+,-,/,*)");
        String oper410 = scanner.nextLine();
        System.out.println("Ingresa el segundo número");
        int num4102 = scanner.nextInt();
        scanner.nextLine();

        int suma4101 = num4101 + num4102;
        int resta4101 = num4101 - num4102;
        int div4101 = num4101 / num4102;
        int mult4101 = num4101 * num4102;
        //4.10 ifs
        if (oper410.contains("+")) {
            System.out.println(num4101 + " + " + num4102 + " = " + suma4101);
        } else if (oper410.contains("-")) {
            System.out.println(num4101 + " - " + num4102 + " = " + resta4101);
        } else if (oper410.contains("*")) {
            System.out.println(num4101 + " * " + num4102 + " = " + mult4101);
        } else if (oper410.contains("/")) {
            System.out.println(num4101 + " / " + num4102 + " = " + div4101);
        } else {
            System.out.println("Error");
        }
        //4.10switch
        switch (oper410) {
            case "+":
                System.out.println(num4101 + " + " + num4102 + " = " + suma4101);
                break;
            case "-":
                System.out.println(num4101 + " - " + num4102 + " = " + resta4101);
                break;
            case "*":
                System.out.println(num4101 + " * " + num4102 + " = " + mult4101);
                break;
            case "/":
                System.out.println(num4101 + " / " + num4102 + " = " + div4101);
                break;
            default:
                System.out.println("Error");
                break;
        }

        //5.1 Bucles
        System.out.println("Ingresa número hasta el que contar");
        int num511=scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<=num511;i++){
            System.out.print(i+" ");
        }

        //5.2
        System.out.println("Ingresa número desde el que contar");
        int num521 =scanner.nextInt();
        scanner.nextLine();
        for(int i = num521; i> 0; i--){
            System.out.print(i+" ");
        }


        //5.3
        System.out.println("Ingresa número para multiplicar");
        int num531 =scanner.nextInt();
        scanner.nextLine();
        for(int i =1; i<=10; i++){
            System.out.print(num531 *i+" ");
        }

        //5.4
        System.out.println("Ingresa número hasta para sumar desde el 1");
        int num541 =scanner.nextInt();
        scanner.nextLine();
        for(int a = 1, b = 0; a<= num541; a++) {
            System.out.print(b +a+ " ");
            b=b+a;
        }
        //5.5

        System.out.println("Ingresa número hasta el que contar con pares");
        int num551 =scanner.nextInt();
        scanner.nextLine();
        int a=2;
        while(a<= num551){
            System.out.print(a+" ");
            a=a+2;
        }

        //5.6
        System.out.println("Ingresa número secreto");
        int num561 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Adivina el número");
        int num562 = scanner.nextInt();
        scanner.nextLine();

        while (num562 != num561) {
            System.out.println("Número erróneo");
            num562 = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("Acertado!");


        //5.7
        String a57;
        do{
            System.out.println("Ingresa 1 para a");
            System.out.println("Ingresa 2 para b");
            System.out.println("Ingresa 3 para c");
            System.out.println("Ingresa 4 para salir");
            a57 = scanner.nextLine();
            switch (a57){
                case "1":
                    System.out.println("a");
                    break;
                case "2":
                    System.out.println("b");
                    break;
                case "3":
                    System.out.println("c");
                    break;
                case "4":
                    System.out.println("Proceso Terminado");
                    break;

                default:
                    System.out.println("ERROR");
            }
        }while(!a57.equals("4"));


        //5.8
        int a58=0;
        int b58;
        System.out.println("Ingresa un número para sumar o 0 para terminar");
        do{
            b58 = scanner.nextInt();
            scanner.nextLine();
            a58=a58+b58;
            System.out.println(a58);
        }
        while(b58!=0);
        System.out.println("Proceso terminado");

        //5.9
        String a59= "perro";
        String b59="0";
        while(!b59.equals(a59)) {
            System.out.println("Escriba la contraseña (perro)");
            b59 = scanner.nextLine();
        }
        System.out.println("Contraseña correcta");


        //5.10
        int a510;
        System.out.println("Ingresa número al que contar en impares");
        a510 = scanner.nextInt();
        scanner.nextLine();
        for(int b510=1;b510<=a510;b510+=2) {
            System.out.print(b510 + " ");
        }

        ///////////////////////////////////////////////////////////
        //Explicación Matrices
        //int[] num1=new int[5];//reservar, opcional

        int [] num = {10,20,30,40,50};
        System.out.println(num[0]);// 0 gives 10, 1 gives 20 etc

        int [][] matrix={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(matrix[1][1]);//gives 5

        int [] num3 = {10,20,30,40,50};
        for (int i=0;i<num3.length;i++){
            System.out.println(num3);

        }
        ////////////////////////////////////////////////////////////////////////

        //6.1
        double init61;
        int tasa61;
        int años61;
        int tiempo61;
        double dinero61;
        System.out.println("Ingresa cantidad inicial de dinero en €");
        init61 =scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa interés anual en %");
        tasa61=scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa número de años");
        años61=scanner.nextInt();
        scanner.nextLine();
        for(tiempo61 =1,dinero61 =init61;tiempo61<=años61;tiempo61++){
            dinero61=dinero61 *((tasa61/100)+1);
            System.out.println("Año= "+tiempo61+" Dinero= "+ dinero61);

        }
       
         */
        //6.2
















































        }
    }
