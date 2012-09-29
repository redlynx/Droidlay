package apps.android.droidlay;

public class Geofence {

	private double diameter;
	private float longitude ;
	private float latitude;
	private boolean wasInGeofence;
	
	private String onEnterText;
	private String onLeavingText;
	
	// getters and setters
	private double getDiameter() {
		return diameter;
	}
	private void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	private float getLongitude() {
		return longitude;
	}
	private void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	private float getLatitude() {
		return latitude;
	}
	private void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	private boolean isWasInGeofence() {
		return wasInGeofence;
	}
	private void setWasInGeofence(boolean wasInGeofence) {
		this.wasInGeofence = wasInGeofence;
	}	
	private String getOnEnterText() {
		return onEnterText;
	}
	private void setOnEnterText(String onEnterText) {
		this.onEnterText = onEnterText;
	}
	private String getOnLeavingText() {
		return onLeavingText;
	}
	private void setOnLeavingText(String onLeavingText) {
		this.onLeavingText = onLeavingText;
	}
	
	// default constructor
	public Geofence()
	{
		wasInGeofence = false; // reset the flag that the user was in the fence
		// reset coordinates
		setLongitude(0.0f);
		setLatitude(0.0f);
		setOnEnterText("fence_entered");
		setOnLeavingText("fence_left");
	}
	
	public Geofence(float longitude, float latitude, double diameter, String enterText, String leavingText)
	{
		wasInGeofence = false; // reset the flag that the user was in the fence
		// reset coordinates
		setLongitude(longitude);
		setLatitude(latitude);
		setDiameter(diameter);
		setOnEnterText(enterText);
		setOnLeavingText(leavingText);
	}
	
	public String GeofenceEntered()
	{
		setWasInGeofence(true);
		// do whatever has to be done here
		return getOnEnterText();
	}
	
	public String GeofenceLeft()
	{
		setWasInGeofence(false);
		// do whatever has to be done
		return getOnLeavingText();
	}
	
	
	
	
	
}
