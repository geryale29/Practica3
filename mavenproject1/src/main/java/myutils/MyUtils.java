/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

/**
 *
 * @author Raúl Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";

        if (cadena == null) {
            resultat = null;
        } else {
            int comptador = cadena.length();
            for (int i = 0; i < cadena.length(); i++, comptador--) {
                resultat += cadena.charAt(comptador - 1);

            }
        }
        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
    public static int edat(int day, int month, int year) {
        int resultat = 0;
        int anyActual=2023,diaActual=2,mesActual=4;
        if (month < 1 || month > 12) {

            resultat = -2;

        } else {
            int diesMes = 0;

            // calcular nombre de dies del mes:
            switch (month) {
                case 2: {
                    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                        diesMes = 29;

                    } else {
                        diesMes = 28;
                    }
                }
                break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diesMes = 30; //abril(4) juny(6) setembre(9) novembre(11)
                    break;
                default:
                    diesMes = 31;
            }

            if (day < 1 || day > diesMes||year>anyActual) {

                resultat = -2;

            } else{
                
                resultat=anyActual-year;
                if (day>diaActual||month>mesActual) {
                    resultat-=1;
                }
                if (resultat>150) {
                    resultat=-1;
                    
                }
            }
            
            }
            
            

            return resultat;
        }
        /**
         *
         * @param numero número del que es calcula el factorial
         * @return retorna el factorial d'un número. Si el nombre es negatiu
         * retorna -1.
         */
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else if(numero<0) {
            return -1;
        } else{
            double resultat = numero * factorial(numero - 1);
            return resultat;
        }
    }
}
