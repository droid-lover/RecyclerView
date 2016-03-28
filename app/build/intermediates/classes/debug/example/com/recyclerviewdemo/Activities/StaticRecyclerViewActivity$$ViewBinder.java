// Generated code from Butter Knife. Do not modify!
package example.com.recyclerviewdemo.Activities;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class StaticRecyclerViewActivity$$ViewBinder<T extends example.com.recyclerviewdemo.Activities.StaticRecyclerViewActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492973, "field 'staticRecyclerViewActivitytTolbar'");
    target.staticRecyclerViewActivitytTolbar = finder.castView(view, 2131492973, "field 'staticRecyclerViewActivitytTolbar'");
    view = finder.findRequiredView(source, 2131492980, "field 'myRecyclerView'");
    target.myRecyclerView = finder.castView(view, 2131492980, "field 'myRecyclerView'");
    view = finder.findRequiredView(source, 2131492972, "field 'mainCoordinatorLayout'");
    target.mainCoordinatorLayout = finder.castView(view, 2131492972, "field 'mainCoordinatorLayout'");
  }

  @Override public void unbind(T target) {
    target.staticRecyclerViewActivitytTolbar = null;
    target.myRecyclerView = null;
    target.mainCoordinatorLayout = null;
  }
}
