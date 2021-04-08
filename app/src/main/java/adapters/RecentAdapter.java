package adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class RecentAdapter extends BaseAdapter {
    private Context mContext;
    private List<String> mListWords;

    public RecentAdapter(Context context, List<String> listWords) {
        mContext = context;
        mListWords = listWords;
    }


    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        View rootView = new
        return null;
    }
}
