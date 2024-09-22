package model;

import java.time.LocalDateTime;

public abstract class Mesure {
private LocalDateTime dateHeure;
private String type;
public abstract double calculer();
public abstract String remarques();
public Mesure() {
	super();
	dateHeure=LocalDateTime.now();
	// TODO Auto-generated constructor stub
}
public Mesure(String type) {
	super();
	this.type = type;
	dateHeure=LocalDateTime.now();
}
public LocalDateTime getDateHeure() {
	return dateHeure;
}
public void setDateHeure(LocalDateTime dateHeure) {
	this.dateHeure = dateHeure;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "Mesure [dateHeure=" + dateHeure + ", type=" + type + ", remarques()=" + remarques() + "]";
}




}
