package apps.android.droidlay;

import com.google.android.maps.MapActivity;
import android.os.Bundle;

public class DroidlayActivity extends MapActivity {

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.id.mapView);
	}
 
	
	

}