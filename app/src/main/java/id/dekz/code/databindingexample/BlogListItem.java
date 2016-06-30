package id.dekz.code.databindingexample;

import android.annotation.TargetApi;
import android.content.Context;
import android.databinding.DataBindingUtil;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import id.dekz.code.databindingexample.databinding.ItemBloglistBinding;

/**
 * Created by DEKZ on 6/29/2016.
 */
public class BlogListItem extends FrameLayout {

    ItemBloglistBinding binding;

    public BlogListItem(Context context) {
        super(context);
        initInflate();
        initInstances();
    }

    public BlogListItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        initInflate();
        initInstances();
    }

    public BlogListItem(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initInflate();
        initInstances();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public BlogListItem(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initInflate();
        initInstances();
    }

    private void initInflate() {
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //binding = DataBindingUtil.inflate(inflater,R.layout.item_bloglist,null,true);
        binding = ItemBloglistBinding.inflate(inflater, this, true);
    }

    private void initInstances() {
        binding.tvTitle.setText("I am the Title");
    }
}
