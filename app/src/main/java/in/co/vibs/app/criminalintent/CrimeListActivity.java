package in.co.vibs.app.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by chethan on 24/2/18.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
