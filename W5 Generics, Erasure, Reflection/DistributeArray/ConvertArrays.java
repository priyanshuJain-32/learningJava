class ConvertArrays{
	    public Double doubleArr[]=new Double[3];
	    public Integer intArr[]=new Integer[3];
	    public int x=0,y=0,z=0;
	    public void convert(String[] arr){
//loop through the arr and store each element 
            int j=0,k=0;
            for(int i=0; i<arr.length; i++){
                try {
                    intArr[k] = Integer.parseInt(arr[i]);
                    k++;
                } catch (NumberFormatException nfe) {
                    doubleArr[j] = Double.parseDouble(arr[i]);
                    j++;
                }

            }
		        //in the appropriate array
}
	    public <T> void display(T[] arr){
	        for(T elements:arr)
	    	        System.out.print(elements+" ");
	        System.out.println();
	    }
}