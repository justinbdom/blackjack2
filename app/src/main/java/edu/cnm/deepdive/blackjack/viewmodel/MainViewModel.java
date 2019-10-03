package edu.cnm.deepdive.blackjack.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModel;
import edu.cnm.deepdive.blackjack.service.BlackjackDatabase;

public class MainViewModel extends AndroidViewModel {

  private final BlackjackDatabase database;
  public MainViewModel(@NonNull Application application) {
    super(application);
    database = BlackjackDatabase.getInstance();

  }
}
