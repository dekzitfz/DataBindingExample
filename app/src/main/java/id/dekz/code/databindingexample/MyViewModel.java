package id.dekz.code.databindingexample;

import android.databinding.ObservableField;

/**
 * Created by DEKZ on 6/30/2016.
 */
public class MyViewModel {
    public final ObservableField<String> name;
    public MyViewModel(String name) {
        this.name = new ObservableField<>(name);
    }
}
