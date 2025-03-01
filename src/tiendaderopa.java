
public class tiendaderopa {
    public static float PrecioCamisetaDescuento;
    
        public static void main(String[] args) throws Exception {
           // DECLARAR VARIABLES
        int PrecioCamiseta = 25;
        int PrecioPantalon = 30;
        float DescuentoCamiseta = 0.15f; // Descuento del 15%
        float DescuentoCamisetaAdicional = 0.05f; // Descuento adicional del 5%

        // CALCULAR PRECIOS CON DESCUENTO
        float PrecioCamisetaDescuento = PrecioCamiseta - (PrecioCamiseta * DescuentoCamiseta); // Precio después del descuento del 15%

        // CALCULAR PRECIO DE LA SEGUNDA CAMISETA CON DESCUENTO ADICIONAL
        float Precio2CamisetaDescuento = PrecioCamisetaDescuento - (PrecioCamisetaDescuento * DescuentoCamisetaAdicional); // Precio de la segunda camiseta con descuento adicional del 5%

        // CALCULAR EL PRECIO TOTAL (Camiseta + Pantalón + Segunda camiseta con descuento)
        float PrecioTotal = Precio2CamisetaDescuento + PrecioPantalon; // Precio total de la compra

        // MOSTRAR LOS RESULTADOS
        System.out.println("Precio de la camiseta con el primer descuento: $" + PrecioCamisetaDescuento);
        System.out.println("Precio de la segunda camiseta con descuento adicional: $" + Precio2CamisetaDescuento);
        System.out.println("Precio total de la compra: $" + PrecioTotal);



     
}
}