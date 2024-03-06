class Ex1{
    public static void main(String[] args){
        int[] x= {0,1,2,3,4};

        try {
            x[5]=5;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("El programa continua...");
    }
}