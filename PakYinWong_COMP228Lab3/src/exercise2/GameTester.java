package exercise2;

abstract class GameTester {
    private String testerName;
    private boolean isFullTime;

    //Constructor
    public GameTester(String testerName, boolean isFullTime) {
        this.testerName = testerName;
        this.isFullTime = isFullTime;
    }
    //end constructor

    //getter
    public String getTesterName() {
        return testerName;
    }
    public boolean getIsFullTime() {
        return isFullTime;
    }

    //setter
    public void setTesterName(String testerName) {
        this.testerName = testerName;
    }
    public void setIsFullTime(boolean isFullTime) {
        this.isFullTime = isFullTime;
    }

    //abstract method
    public abstract double salary();
    public abstract void display();
}
