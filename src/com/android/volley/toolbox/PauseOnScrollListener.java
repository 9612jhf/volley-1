package com.android.volley.toolbox;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;

/**
 * AbsListView�Ļ�������ͼƬ����
 * PauseOnScrollListener
 * chenbo
 * 2014��10��23�� ����10:09:31
 * @version 3.6
 */
public class PauseOnScrollListener implements OnScrollListener {

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        // TODO Auto-generated method stub
        
    }
//
//    private BitmapTools bitmapTools;
//
//    private final boolean pauseOnScroll;
//    private final boolean pauseOnFling;
//    private final OnScrollListener externalListener;
//
//    public PauseOnScrollListener(BitmapTools imageLoader, boolean pauseOnScroll, boolean pauseOnFling) {
//        this(imageLoader, pauseOnScroll, pauseOnFling, null);
//    }
//
//    public PauseOnScrollListener(BitmapTools bitmapTools, boolean pauseOnScroll, boolean pauseOnFling,
//            OnScrollListener customListener) {
//        this.bitmapTools = bitmapTools;
//        this.pauseOnScroll = pauseOnScroll;
//        this.pauseOnFling = pauseOnFling;
//        externalListener = customListener;
//    }
//
//    @Override
//    public void onScrollStateChanged(AbsListView view, int scrollState) {
//        switch (scrollState) {
//        case OnScrollListener.SCROLL_STATE_IDLE:
//            bitmapTools.resume();
//            break;
//        case OnScrollListener.SCROLL_STATE_TOUCH_SCROLL:
//            if (pauseOnScroll) {
//                bitmapTools.pause();
//            }
//            break;
//        case OnScrollListener.SCROLL_STATE_FLING:
//            if (pauseOnFling) {
//                bitmapTools.pause();
//            }
//            break;
//        }
//        if (externalListener != null) {
//            externalListener.onScrollStateChanged(view, scrollState);
//        }
//    }
//
//    @Override
//    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
//        if (externalListener != null) {
//            externalListener.onScroll(view, firstVisibleItem, visibleItemCount, totalItemCount);
//        }
//    }
}
