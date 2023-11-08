class ChainExcDemo{
    static void demoproc() throws NullPointerException{
        NullPointerException e = new NullPointerException("top layer");

        e.initCause(new ArithmeticException("Cause"));

        throw e;
    }
    public static void main(String[] args){
        try{
            demoproc();
        } catch(NullPointerException e){
            System.out.println("Caught: " + e);

            System.out.println("Original cause: " + e.getCause());
        }
    }
}