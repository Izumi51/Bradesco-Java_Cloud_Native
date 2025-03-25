public class SmartTv {
    boolean state = false;
    int channel = 1;
    int volume = 0; 

    // Get
    public int getChannel() {
        return channel;
    }
    public int getVolume() {
        return volume;
    }
    public boolean getState() {
        return state;
    }

    //Set
    public void setChannel(int channel) {
        this.channel = channel;
    }

    // Methods
    public void changeState() {
        this.state = !state;
    }

    public void riseVolume() {
        this.volume++;
    }
    
    public void downVolume() {
        this.volume--;
    }
    
    public void riseChannel() {
        this.channel++;
    }
    
    public void downChannel() {
        this.channel--;
    }
}