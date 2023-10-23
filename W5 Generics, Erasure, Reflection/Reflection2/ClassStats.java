class ClassStats{
public static int getPubMethodCount(String cname) {
        try {
            //add code to return the count of
            int pmc = 0;
            Class c = Class.forName(cname);
            Method[] methods = c.getMethods();
            for(int i=0; i<methods.length; i++){
                pmc++;
            }
            return pmc;
            //public methods in the given class		
        }catch(Exception e) { return -1; }
    }
    public static int getAllMethodCount(String cname) {
        try {
            //add code to return the count of all
            int amc = 0;
            Class c = Class.forName(cname);
            Method[] methods = c.getDeclaredMethods();
            for(int i=0; i<methods.length; i++){
                amc++;
            }
            return amc;
            //declared methods in the given class		
        }catch(Exception e) { return -1; }
    }
    public static int getPubFieldCount(String cname) {
        try {
            //add code to return the count of
            int pfc = 0;
            Class c = Class.forName(cname);
            Field[] fields = c.getFields();
            for(int i=0; i<fields.length; i++){
                pfc++;
            }
            return pfc;
            //public fields (instance variables) in the given class
        }catch(Exception e) { return -1; }
    }
    public static int getAllFieldCount(String cname) {
        try {
            //add code to return the count of
            int afc = 0;
            Class c = Class.forName(cname);
            Field[] fields = c.getDeclaredFields();
            for(int i=0; i<fields.length; i++){
                afc++;
            }
            return afc;
            //all fields (instance variables) in the given class
        }catch(Exception e) { return -1; }
    }
    public static int getPubContCount(String cname) {
        try {
            //add code to return the count of
            int cc = 0;
            Class c = Class.forName(cname);
            Constructor[] constructors = c.getConstructors();
            for(int i=0; i<constructors.length; i++){
                cc++;
            }
            return cc;
            //public constructors in the given class
        }catch(Exception e) { return -1; }		
    }
    public static int getAllContCount(String cname) {
        try {
            //add code to return the count of
            int acc = 0;
            Class c = Class.forName(cname);
            Constructor[] constructors = c.getDeclaredConstructors();
            for(int i=0; i<constructors.length; i++){
                acc++;
            }
            return acc;
            //all constructors in the given class
        }catch(Exception e) { return -1; }
    }
}