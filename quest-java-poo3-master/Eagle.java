public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }
    
    @Override
   public void takeOff() {
    	if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s take of into the air. %n", this.getName());
        }	
    }
	
    @Override
	public int ascend(int meters) {
    	if (this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flys upward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;	
    }
	
    @Override
	public int descend(int meters) {
    	if (this.flying) {
            this.altitude = Math.max(this.altitude - meters,  0);
            System.out.printf("%s flys downward, altitude : %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
	
    @Override
	public void land() {
    	if (this.flying && this.altitude == 0) {
            System.out.printf("%s lands on the earth.%n", this.getName());
        } else {
            System.out.printf("%s is too high, it can't land.%n", this.getName());
        }
    	
    }
}
