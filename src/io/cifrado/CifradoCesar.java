package io.cifrado;

public class CifradoCesar {

    public static String cifrar(String cadena, int desplazamiento){
        String cadenaAuxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) >= 65 && cadena.charAt(i) <= 90) {

                cadenaAuxiliar += (char) ((int) (((cadena.charAt(i) - 65 + desplazamiento) % 26) + 65));

            } else if (cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122) {

                cadenaAuxiliar += (char) ((int) (((cadena.charAt(i) - 97 + desplazamiento) % 26) + 97));

            }
        }
        return cadenaAuxiliar;
    }

    public static String descifrar(String cadena, int desplazamiento){
        String cadenaAuxiliar = "";
        for (int i = 0; i < cadena.length(); i++) {

            if(cadena.charAt(i)==' '){
                cadenaAuxiliar+=" ";
            }else if(cadena.charAt(i)==',')
            {
                cadenaAuxiliar+=",";
            }else if(cadena.charAt(i)=='.')
            {
                cadenaAuxiliar+=".";
            }else if(cadena.charAt(i)==';')
            {
                cadenaAuxiliar+=";";
            }

            if (cadena.charAt(i) >= 65 && cadena.charAt(i) <= 90) {

                cadenaAuxiliar += (char) ((int) (((cadena.charAt(i) + 65 - desplazamiento) % 26) + 65));

            } else if (cadena.charAt(i) >= 97 && cadena.charAt(i) <= 122) {
                if (cadena.charAt(i) - desplazamiento < 97)
                {
                    cadenaAuxiliar+= (char) (122 - (int) (desplazamiento-((int)(cadena.charAt(i))-96)));
                }else {

                    cadenaAuxiliar+= (char) (int) (((int)(cadena.charAt(i)))-desplazamiento);
                }
            }
        }
        return cadenaAuxiliar;
    }
}
