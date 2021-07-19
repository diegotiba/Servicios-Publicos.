
import MODELO.Agua;
import MODELO.Gas;
import MODELO.Luz;
import VISTA.vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author User
 */
public class controlador {

    private vista Vistamenu;
    private vista estratovista;
    private vista consumovista;

//    private Agua aguaconsumo;
    //private Agua mostrar;
//    private Agua estratoagua;
//    private double desconsumo;
    public controlador() {
        Vistamenu = new vista();
        estratovista = new vista();
        consumovista = new vista();

//        aguaconsumo = new Agua();
        //mostrar = new Agua();
//        estratoagua = new Agua();
    }

    public void menu() {

        Agua datos = new Agua(0, 0, 0, 0, 0, 0);
        Gas datos2 = new Gas(0, 0, 0, 0, 0, 0);
        Luz datos3 = new Luz(0, 0, 0, 0, 0, 0);

        int xagua = 9256;
        double xgas=5234.0;
        int xenergia=6200;
        int opcion1 = 0;
        while (opcion1 != 4) {
            opcion1 = Vistamenu.menuVista();

            switch (opcion1) {

                case 1:
                    int Ee = estratovista.estrato();
                    int Ec = consumovista.consumo();
                    datos3.setConsumo(Ec);
                    datos3.setUnidad(xenergia);
                    datos3.setEstrato(Ee);
                    datos3.setConsumototal(xenergia * Ec);
                    if (Ee >= 1 && Ee <= 2) {
                        datos3.setDesconsumo((xenergia * Ec*-1) * (0.5));
                    }
                    if (Ee >= 3 && Ee <= 4) {
                        datos3.setDesconsumo((xenergia * Ec) * (0.1));
                    }
                    if (Ee >= 5 && Ee <= 6) {
                        datos3.setDesconsumo((xenergia * Ec) * (0.25));
                    }
                    datos3.setImpuesto((xenergia * Ec) * 0.01);
                    datos3.verdatos();
                    break;
                case 2:
                    int Ae = estratovista.estrato();
                    int Ac = consumovista.consumo();
                    datos.setConsumo(Ac);
                    datos.setUnidad(xagua);
                    datos.setEstrato(Ae);
                    datos.setConsumototal(xagua * Ac);
                    if (Ae >= 1 && Ae <= 2) {
                        datos.setDesconsumo((xagua * Ac) * (0.5));
                    }
                    if (Ae >= 3 && Ae <= 4) {
                        datos.setDesconsumo((xagua * Ac*-1) * (0.1));
                    }
                    if (Ae >= 5 && Ae <= 6) {
                        datos.setDesconsumo((xagua * Ac) * (0.25));
                    }
                    datos.setImpuesto((xagua * Ac) * 0.01);
                    datos.verdatos();

                    break;
                case 3:
                    int Ge = estratovista.estrato();
                    int Gc = consumovista.consumo();
                    datos2.setConsumo(Gc);
                    datos2.setUnidad(xgas);
                    datos2.setEstrato(Ge);
                    datos2.setConsumototal(xgas * Gc);
                    if (Ge >= 1 && Ge <= 2) {
                        datos2.setDesconsumo((xgas * Gc) * (0.5));
                    }
                    if (Ge >= 3 && Ge <= 4) {
                        datos2.setDesconsumo((xgas * Gc) * (0.1));
                    }
                    if (Ge >= 5 && Ge <= 6) {
                        datos2.setDesconsumo((xgas * Gc) * (0.25));
                    }
                    datos2.setImpuesto((xgas * Gc) * 0.01);
                    datos2.verdatos();
                    break;

            }

        }
        if(opcion1==4){
            System.out.println("Opción:");
            System.out.println("Hasta pronto");
        }
    }

//    public Agua Calcular(Agua estrato, Agua consumo) {
//        double estratoAgua = estrato.getConsumo();
//        double consumoAgua = consumo.getConsumo();
//
//        double consumoTotal = consumoAgua * 9256;
//        if (estratoAgua >= 1 && estratoAgua <= 2) {
//            desconsumo = consumoAgua * (0.5);
//
//        }
//        if (estratoAgua >= 3 && estratoAgua <= 4) {
//            desconsumo = consumoAgua * (0.1);
//
//        }
//        if (estratoAgua >= 5 && estratoAgua <= 6) {
//            desconsumo = consumoAgua * (0.25);
//
//        }
//        Agua resultado = new Agua(desconsumo, consumoTotal);
//
//        return resultado;
//    }
}
