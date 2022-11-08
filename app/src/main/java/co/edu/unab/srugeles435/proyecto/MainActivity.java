package co.edu.unab.srugeles435.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import co.edu.unab.srugeles435.proyecto.adapter.BannerMoviesAdapter;
import co.edu.unab.srugeles435.proyecto.adapter.MainRecyclerAdapter;
import co.edu.unab.srugeles435.proyecto.model.AllCategory;
import co.edu.unab.srugeles435.proyecto.model.BannerMovies;
import co.edu.unab.srugeles435.proyecto.model.CategoryItem;

public class MainActivity extends AppCompatActivity {

    BannerMoviesAdapter bannerMoviesAdapter;
    TabLayout indicatorTab, categoryTab;
    ViewPager bannerMoviesViewPager;
    List<BannerMovies> moviesBannerList;
    List<BannerMovies> seriesBannerList;
    List<BannerMovies> kidsBannerList;
    List<BannerMovies> animeBannerList;

    MainRecyclerAdapter mainRecyclerAdapter;
    RecyclerView mainRecycler;
    List<AllCategory> allCategoryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indicatorTab = findViewById(R.id.tab_indicator);
        categoryTab = findViewById(R.id.tabLayout);

        moviesBannerList = new ArrayList<>();
        moviesBannerList.add(new BannerMovies(1,"Better Call Saul","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DsPacGelDaug&psig=AOvVaw1fuvTXs9n12_t1CNQRxNKq&ust=1667590683517000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCLCX5MThkvsCFQAAAAAdAAAAABAH",""));
        moviesBannerList.add(new BannerMovies(2,"Sanic","https://www.google.com/url?sa=i&url=https%3A%2F%2Fmeme.fandom.com%2Fes%2Fwiki%2FSanic_Hegehog&psig=AOvVaw3umH_ZDnKfBWQtBodettLZ&ust=1667590806077000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCMjZvoDikvsCFQAAAAAdAAAAABAD",""));
        moviesBannerList.add(new BannerMovies(3,"Forg","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.reddit.com%2Fr%2Ffrogs%2Fcomments%2Fixrtk8%2Fforg%2F&psig=AOvVaw3Y5I9-aqFwUx-iaGKJRf6K&ust=1667590827028000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCJDw6ojikvsCFQAAAAAdAAAAABAD",""));
        moviesBannerList.add(new BannerMovies(4,"La creatura","https://www.google.com/url?sa=i&url=https%3A%2F%2Ffanbears.fandom.com%2Ff%2Fp%2F4400000000000075028&psig=AOvVaw3rmmZEJsx_lwCrfmgruvDB&ust=1667590845106000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCJDzv5bikvsCFQAAAAAdAAAAABAD",""));

        seriesBannerList = new ArrayList<>();
        seriesBannerList.add(new BannerMovies(1,"Better Call Saul","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DsPacGelDaug&psig=AOvVaw1fuvTXs9n12_t1CNQRxNKq&ust=1667590683517000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCLCX5MThkvsCFQAAAAAdAAAAABAH",""));

        kidsBannerList = new ArrayList<>();
        kidsBannerList.add(new BannerMovies(1,"Better Call Saul","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DsPacGelDaug&psig=AOvVaw1fuvTXs9n12_t1CNQRxNKq&ust=1667590683517000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCLCX5MThkvsCFQAAAAAdAAAAABAH",""));

        animeBannerList = new ArrayList<>();
        animeBannerList.add(new BannerMovies(1,"Better Call Saul","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DsPacGelDaug&psig=AOvVaw1fuvTXs9n12_t1CNQRxNKq&ust=1667590683517000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCLCX5MThkvsCFQAAAAAdAAAAABAH",""));



        //setBannerMoviesPagerAdapter(moviesBannerList);

        categoryTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 1:
                        setBannerMoviesPagerAdapter(seriesBannerList);
                        return;
                    case 2:
                        setBannerMoviesPagerAdapter(kidsBannerList);

                        return;
                    case 3:
                        setBannerMoviesPagerAdapter(animeBannerList);

                        return;
                    default:
                        setBannerMoviesPagerAdapter(moviesBannerList);
                }

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        List<CategoryItem> moviesCatListItem1 = new ArrayList<>();
        moviesCatListItem1.add(new CategoryItem(1,"Better Call Saul","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.youtube.com%2Fwatch%3Fv%3DsPacGelDaug&psig=AOvVaw1fuvTXs9n12_t1CNQRxNKq&ust=1667590683517000&source=images&cd=vfe&ved=0CA0QjRxqFwoTCLCX5MThkvsCFQAAAAAdAAAAABAH",""));

        allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Accion", 1,moviesCatListItem1));
        allCategoryList.add(new AllCategory("Comedia", 2,moviesCatListItem1));
        allCategoryList.add(new AllCategory("Romance", 3,moviesCatListItem1));
        allCategoryList.add(new AllCategory("Drama", 4,moviesCatListItem1));
        allCategoryList.add(new AllCategory("Terror", 5,moviesCatListItem1));

        setMainRecycler(allCategoryList);

    }

    private void setBannerMoviesPagerAdapter(List<BannerMovies> bannerMoviesList){
        bannerMoviesViewPager = findViewById(R.id.banner_viewPager);
        bannerMoviesAdapter = new BannerMoviesAdapter(this, bannerMoviesList);
        bannerMoviesViewPager.setAdapter(bannerMoviesAdapter);
        indicatorTab.setupWithViewPager(bannerMoviesViewPager);
    }


    public void setMainRecycler(List<AllCategory> allCategoryList){
        mainRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL,false);
        mainRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainRecycler.setAdapter(mainRecyclerAdapter);
    }

}