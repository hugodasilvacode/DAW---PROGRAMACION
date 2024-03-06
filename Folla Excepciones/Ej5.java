/*
    Fai un pequeno programa para controlar o stock dun produto (id, prezo e cantidade). 
    A cantidade por defecto é de 50 unidades. Crea en AppProduto un método estático 
    venderProduto(Produto a, int cantidade), e crea a túa propia clase de excepción 
    produtoSenStockException (filla de Exception) para xestionar a falta de stock.
*/

class AppProduto {
    public static void main(String[] args) {
        
        Produto prod1 = new Produto("123", 17.99);

        try {
            venderProduto(prod1, 51);
            System.out.println(prod1.cantidade);
        } catch (Exception e) {
            System.out.println("No se pudo vender el producto: "+ e.getMessage());
        }
    }

    public static void venderProduto(Produto produto, int cantidade) throws produtoSenStockException {
        if (produto.cantidade < cantidade) {
            throw new produtoSenStockException();
        }
        produto.cantidade -= cantidade;
    }
}

class Produto {
    
    private String id;
    private double prezo;
    public int cantidade;

    public Produto(String id, double prezo) {
        this.id = id;
        this.prezo = prezo;
        this.cantidade = 50;
    }
}