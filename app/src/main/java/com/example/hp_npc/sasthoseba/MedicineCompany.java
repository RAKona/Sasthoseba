package com.example.hp_npc.sasthoseba;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MedicineCompany extends AppCompatActivity {

    ListView listView;
    String[] medicine={"Ace Plus®","Ace®","Acetram®","Ambrox®","Almex®",
            "B-50 Forte®","Bactrocin®","Bicozin-I®",
    "Bicozin®","Calbo 500®","Clinface®","Dermasol®","Dexonex® Eye/Ear Drops","Famotack®","Fungidal®","Inflagic ®","Olicod ®"};

     String[] desec={"Paracetamol & Caffeine","Paracetamol","Paracetamol+Tramadol",
         "Ambroxol ","Albendazole","Vitamin B Complex","Mupirocin","Iron Polymaltose + Thiamine","Vitamin B Complex and Zinc","Calcium Carbonate",
        "Clindamycin Phosphate+Tretinoin","Clobetasol Propionate","Dexamethasone","Famotidine","Miconazole Nitrate","Prednisolone ","Cod liver oil"};


     Integer[] image={R.drawable.aceplus,R.drawable.ace,R.drawable.acrim,R.drawable.ambox,R.drawable.almex,R.drawable.b50,R.drawable.bactorin,R.drawable.bicol,R.drawable.bicojin,
     R.drawable.calbo,R.drawable.clinface,R.drawable.der,R.drawable.eyedrp,R.drawable.famo,R.drawable.fungidal,R.drawable.inflagic,R.drawable.olicod};

  ArrayAdapter<String>arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicine_company);

  listView=(ListView)  findViewById(R.id.listview);
  CustomAdapter customAdapter=new CustomAdapter();
  listView.setAdapter(customAdapter);
  listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

          switch(medicine[position]) {
              case "Ace Plus®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.aceplus));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "Ace plus", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;


              }case "Ace®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.ace));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "Ace", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;


              }


              case "B-50 Forte®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.b50));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "b 50", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;


              }

              case "Bicozin®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.bicozin));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "bicozin", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;

              }

                  case "Acetram®": {

                      Intent intent = new Intent(MedicineCompany.this, Result.class);
                      intent.putExtra("info", getResources().getString(R.string.acetram));
                      intent.putExtra("image", image[position]);
                      Toast.makeText(MedicineCompany.this, "Acetram", Toast.LENGTH_SHORT).show();

                      startActivity(intent);
                      break;
                  }
                  case "Bicozin-I®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.bicozinl));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "Bicozin-I", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;


              } case "Ambrox®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.ambrox));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "Ambrox", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;
              }

                  case "Almex®": {

                      Intent intent = new Intent(MedicineCompany.this, Result.class);
                      intent.putExtra("info", getResources().getString(R.string.almex));
                      intent.putExtra("image", image[position]);
                      Toast.makeText(MedicineCompany.this, "Almex", Toast.LENGTH_SHORT).show();

                      startActivity(intent);
                      break;
                  }

                  case "Bactrocin®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.bactrocin));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "Bactrocin", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;


              } case "Calbo 500®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.calbo));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "Calbo 500", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;


              }



              case "Clinface®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.clinface));
                  intent.putExtra("image", image[position]);
                  Toast.makeText(MedicineCompany.this, "Clinface", Toast.LENGTH_SHORT).show();

                  startActivity(intent);
                  break;


              }


              case "Dermasol®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.dermasol));
                  intent.putExtra("image", image[position]);

                  startActivity(intent);
                  break;


              }case "Dexonex® Eye/Ear Drops": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.eyedrop));
                  intent.putExtra("image", image[position]);

                  startActivity(intent);
                  break;


              }case "Famotack®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.famo));
                  intent.putExtra("image", image[position]);

                  startActivity(intent);
                  break;


              }case "Fungidal®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.fungaidal));
                  intent.putExtra("image", image[position]);

                  startActivity(intent);
                  break;


              }case "Inflagic ®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.inflagic));
                  intent.putExtra("image", image[position]);

                  startActivity(intent);
                  break;
                  }case "Olicod ®": {

                  Intent intent = new Intent(MedicineCompany.this, Result.class);
                  intent.putExtra("info", getResources().getString(R.string.oikot));
                  intent.putExtra("image", image[position]);

                  startActivity(intent);
                  break;
                  }
          }

      }

  });
    }



class CustomAdapter extends BaseAdapter{


    private View view;

    @Override
    public int getCount( ) {

        return image.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        view=getLayoutInflater().inflate(R.layout.custom,null);
        ImageView imageView=(ImageView) view.findViewById(R.id.imagelist);
        TextView textView2=(TextView) view .findViewById(R.id.text2);
        TextView textView=(TextView)view.findViewById(R.id.text1);

        imageView.setImageResource(image[position]);
        textView.setText(medicine [position]);
        textView2.setText(desec [position]);
        return view;
    }


    }
}