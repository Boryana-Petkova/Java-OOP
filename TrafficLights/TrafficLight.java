package TrafficLights;

public class TrafficLight {
    private Color color;

    public TrafficLight(Color color) {
        this.color = color;
    }

    public String getColor() { // това не е гетър, това е стринг
                                // и взимаме цвета под формата на стринг
        return this.color.name();
    }

    public void changeColor(){
        switch (this.color){
            case RED:
                this.color = Color.GREEN;
                break;
            case GREEN:
                this.color = Color.YELLOW;
                break;
            case YELLOW:
                this.color = Color.RED;
                break;
        }
    }
}
