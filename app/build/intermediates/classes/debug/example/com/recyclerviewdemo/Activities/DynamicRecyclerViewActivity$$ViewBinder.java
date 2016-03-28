// Generated code from Butter Knife. Do not modify!
package example.com.recyclerviewdemo.Activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class DynamicRecyclerViewActivity$$ViewBinder<T extends example.com.recyclerviewdemo.Activities.DynamicRecyclerViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492969, "field 'dynamicActivityToolbar'");
    target.dynamicActivityToolbar = finder.castView(view, 2131492969, "field 'dynamicActivityToolbar'");
    view = finder.findRequiredView(source, 2131492976, "field 'dynamicRecyclerView'");
    target.dynamicRecyclerView = finder.castView(view, 2131492976, "field 'dynamicRecyclerView'");
    view = finder.findRequiredView(source, 2131492973, "field 'decreaseFab' and method 'decreaseFabClicked'");
    target.decreaseFab = finder.castView(view, 2131492973, "field 'decreaseFab'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.decreaseFabClicked();
        }
      });
    view = finder.findRequiredView(source, 2131492975, "field 'increaseFab' and method 'increaseFabClicked'");
    target.increaseFab = finder.castView(view, 2131492975, "field 'increaseFab'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.increaseFabClicked();
        }
      });
    view = finder.findRequiredView(source, 2131492974, "field 'countEdittext'");
    target.countEdittext = finder.castView(view, 2131492974, "field 'countEdittext'");
  }

  @Override public void unbind(T target) {
    target.dynamicActivityToolbar = null;
    target.dynamicRecyclerView = null;
    target.decreaseFab = null;
    target.increaseFab = null;
    target.countEdittext = null;
  }
}
