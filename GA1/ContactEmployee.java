class ContactEmployee extends Employee{
    final private static double hourlyPay = 100.00;
    private int contactHour;
	public ContactEmployee(String name, long aadharno, int ch){
	    super(name, aadharno, ch*hourlyPay);
	    this.contactHour = ch;
	}
}