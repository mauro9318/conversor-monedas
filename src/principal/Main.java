package principal;

import com.proyecto.conversormonedas.modelos.*;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        //Declaración e incializacion de variables
        double monedaEscogida;
        double cantidad = 0;
        double respuestaCliente = 0;

        String divisaOriginal = "";
        String divisaAcambiar = "";


        //Creación de una nueva instancia de la clase BuscarMoneda
        BuscarMoneda buscarMoneda = new BuscarMoneda();
        //Creación de una nueva instancia de la clase SolicitudApi
        SolicitudApi api = new SolicitudApi();
        //Creacion de una nueva instancia de la clase LecturaDatos
        LecturaDatos lecturaDatos = new LecturaDatos();
        //Creación de una nueva instancia de la clase Mensaje
        Mensaje mensaje = new Mensaje();
        //Creación de una nueva instacia de la clase ObtenerTipoDeCambio
        ObtenerTipoDeCambio obtenerTipoDeCambio = new ObtenerTipoDeCambio();


        //Inicializacion para poder ingresar datos por teclado
        Scanner teclado = new Scanner(System.in);

        String respuestaDeLaApi = api.obtenerApi();
        lecturaDatos.guardarDatos(respuestaDeLaApi);


        int decision = 4;
        while(decision != 0){


            System.out.println("""
                    
                    -----------------------------------------------------------------
                                    Sistema de conversion de monedas
                    El sistema que usted puede apreciar puede realizar el cambio de
                    una moneda a otra moneda, este proceso lo realiza consumiendo una
                    API que tiene información de el valor de las divisas de distintos
                    países.
                    -----------------------------------------------------------------
                    
                    
                    A continuación podrá ver el menu de opciones y podra seleccionar
                    la opción que desee.
                    
                    1. Convertir de dólar a boliviano.
                    2. Convertir de boliviano a dolar.
                    3. Convertir de dólar a real brasileño.
                    4. Convertir de real brasileño a dólar.
                    5. Convertir de dolar a peso argentino.
                    6. Convertir de peso argentino a dolar.
                    
                    0. Salir
                    
                    
                    Ingrese la operación que desea realizar: 
                    
                    """);

            //Variable que permite capturar el dato ingresado por el usuario y al mismo tiempo verificar si el proceso
            //continua o culmina
            decision = teclado.nextInt();

            switch (decision){
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                case 1:
                    divisaOriginal = "dolares";
                    divisaAcambiar = "bolivianos";
                    System.out.println("Presiono la opcion "+decision);
                    monedaEscogida = obtenerTipoDeCambio.tipoCambioBolivianos();
                    System.out.println(mensaje.mostrarMensajeDolares());
                    cantidad = teclado.nextDouble();
                    respuestaCliente = CalcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println(cantidad+ " "+divisaOriginal +" equivale a "+respuestaCliente+" "+divisaAcambiar);
                    break;

                case 2:
                    divisaOriginal = "bolivianos";
                    divisaAcambiar = "dolares";
                    System.out.println("Presiono la opcion "+decision);
                    monedaEscogida = obtenerTipoDeCambio.tipoCambioBolivianos();
                    System.out.println(mensaje.mostrarMensajeBolivianos());
                    cantidad = teclado.nextDouble();
                    respuestaCliente = CalcularCambioDivisa.conversionDolar(cantidad, monedaEscogida);
                    System.out.println(cantidad+" "+divisaOriginal+ " equivale a "+respuestaCliente+" "+divisaAcambiar);
                    break;

                case 3:
                    System.out.println("Presiono la opcion 3");
                    divisaOriginal = "dolares";
                    divisaAcambiar = "reales";
                    System.out.println("Presiono la opcion "+ decision);
                    monedaEscogida = obtenerTipoDeCambio.tipoCambioRealBrasilero();
                    System.out.println(mensaje.mostrarMensajeDolares());
                    cantidad = teclado.nextDouble();
                    respuestaCliente = CalcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println(cantidad+" "+divisaOriginal +" equivale a "+respuestaCliente+ " "+divisaAcambiar );

                    break;

                case 4:

                    System.out.println("Presiono la opcion 4");
                    divisaOriginal = "reales";
                    divisaAcambiar = "dolares";
                    System.out.println("Presiono la opcion "+ decision);
                    monedaEscogida = obtenerTipoDeCambio.tipoCambioRealBrasilero();
                    System.out.println(mensaje.mostrarMensajeReales());
                    cantidad = teclado.nextDouble();
                    respuestaCliente = CalcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println(cantidad+" "+divisaOriginal +" equivale a "+respuestaCliente+ " "+divisaAcambiar );

                    break;


                case 5:
                    System.out.println("Presiono la opcion 5");
                    divisaOriginal = "dolares";
                    divisaAcambiar = "pesos argentinos";
                    System.out.println("Presiono la opcion "+ decision);
                    monedaEscogida = obtenerTipoDeCambio.tipoCambioPesoArgentino();
                    System.out.println(mensaje.mostrarMensajeDolares());
                    cantidad = teclado.nextDouble();
                    respuestaCliente = CalcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println(cantidad+" "+divisaOriginal +" equivale a "+respuestaCliente+ " "+divisaAcambiar );
                    break;

                case 6:
                    System.out.println("Presiono la opcion 6");
                    divisaOriginal = "pesos argentinos";
                    divisaAcambiar = "dolares";
                    System.out.println("Presiono la opcion "+ decision);
                    monedaEscogida = obtenerTipoDeCambio.tipoCambioPesoArgentino();
                    System.out.println(mensaje.mostrarMensajePesosArgentinos());
                    cantidad = teclado.nextDouble();
                    respuestaCliente = CalcularCambioDivisa.conversion(cantidad, monedaEscogida);
                    System.out.println(cantidad+" "+divisaOriginal +" equivale a "+respuestaCliente+ " "+divisaAcambiar );
                    break;

                default:
                    System.out.println("Dato no permitido");
                    break;
            }


        }
        System.out.println("""
                -----------------------------------------------------------------
                                       Gracias por usar el programa
                                Sistema desarrollado por MAURICIO FLORES
                -----------------------------------------------------------------    
                """);

        String example = api.obtenerApi();

        System.out.println("La respuesta de la API: "+ example);

    }
}
