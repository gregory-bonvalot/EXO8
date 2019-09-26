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
    	if (this.altitude == 0 && !this.flying) {
    		this.flying = true;
            System.out.printf("%s attention au décollage !", this.getName());//  %d%n
            if (this.flying) {
            	System.out.println("flying = true");
            }
            
    	}
    }
    @Override
    public int ascend(int meters) {
    	 if (this.flying) {
             this.altitude = Math.max(meters - this.altitude, 0);
             System.out.printf("%s on monte à :  %d%n", this.getName(), this.altitude);
         }
         return this.altitude;
    }
    @Override
    public int descend(int meters) {
    	if (this.flying) {
            this.altitude = Math.min(this.altitude + meters, 325);
            System.out.printf("%s on chuuuuute à :  %d%n", this.getName(), this.altitude);
        }
        return this.altitude;
    }
    
    @Override
    public void land() {
    	if (this.altitude == 0 && !this.flying) {
            System.out.printf("%s tranquille posé au sol  %d%n", this.getName());
    	}
    }
    @Override
    public void glide() {
    	if (this.altitude != 0 && this.flying) {
            System.out.printf("%s je vooooole !  %d%n", this.getName());
    	}
    }
}
