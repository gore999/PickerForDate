package rodriguezfernandez.carlos.pickerfordate;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @NonNull
    public Dialog onCreateDialog(Bundle savedInstance){
        final Calendar c= Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        int month=c.get(Calendar.MONTH);
        int day=c.get(Calendar.DAY_OF_MONTH);
        return new DatePickerDialog(getActivity(),this,year,month,day);

    }


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        //Cuando se haga el set de fecha.
        MainActivity activity=(MainActivity) getActivity();// Recuperar la actividad a la que se asocia el fragmento.
        activity.processDatePickerResult(year,month,dayOfMonth);
    }
}
