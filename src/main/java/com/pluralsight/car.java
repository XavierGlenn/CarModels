public void main() {
}

//Variables
private String model;
private String price;
private String color;
private String purpose;
private int year;

//this.-
public car(String _model, String _color, String _price, int _year, String _purpose) {
    this.model = _model;
    this.color = _color;
    this.price = _price;
    this.purpose = _purpose;
    this.year = _year;
}

//Empty constructor
public car()
{

}
public String getModel() {
    return model;
}

public String getColor() {
    return color;
}
public String getPurpose() {
    return purpose;
}

public int getYear() {
    return year;
}

public String getPrice(double _price) {
    return price;
}
