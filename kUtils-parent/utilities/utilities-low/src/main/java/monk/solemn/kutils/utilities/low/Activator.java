package monk.solemn.kutils.utilities.low;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {
	BundleContext osgiContext;
	
	@Override
	public void start(BundleContext context) throws Exception {
		osgiContext = context;
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}
}
