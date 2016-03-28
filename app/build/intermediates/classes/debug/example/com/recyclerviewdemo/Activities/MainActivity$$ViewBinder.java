// Generated code from Butter Knife. Do not modify!
package example.com.recyclerviewdemo.Activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends example.com.recyclerviewdemo.Activities.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492971, "field 'mainActivityToolbar'");
    target.mainActivityToolbar = finder.castView(view, 2131492971, "field 'mainActivityToolbar'");
    view = finder.findRequiredView(source, 2131492978, "field 'staticRecyclerTextView' and method 'staticRecyclerTextViewClicked'");
    target.staticRecyclerTextView = finder.castView(view, 2131492978, "field 'staticRecyclerTextView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.staticRecyclerTextViewClicked();
        }
      });
    view = finder.findRequiredView(source, 2131492979, "field 'dynamicRecyclerTextView' and method 'dynamicRecyclerTextViewClicked'");
    target.dynamicRecyclerTextView = finder.castView(view, 2131492979, "field 'dynamicRecyclerTextView'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.dynamicRecyclerTextViewClicked();
        }
      });
  }

  @Override public void unbind(T target) {
    target.mainActivityToolbar = null;
    target.staticRecyclerTextView = null;
    target.dynamicRecyclerTextView = null;
  }
}
