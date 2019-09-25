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
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class HerbalMedicine extends AppCompatActivity {
    ListView listView;
    String [] herbalmedicine={"Adovas®","AmCivit®","Livolite®","Arubin®","Eprim®","Garlin™","Ispergul®","Jorvan™","Monera®","Redclov™","Ulpep™"};

    String[] cotag={"Adhatoda vasica","Amlaki rashayan","Herbal & Nutraceuticals","Herbal & Nutraceuticals","Herbal & Nutraceuticals","Herbal & Nutraceuticals","Herbal & Nutraceuticals","Jogaraj Guggulu","Bacopa extract","Red clover Isoflavones 40 mg","Hingastak churna"};

    int [] imageme={R.drawable.adovas,R.drawable.amcivit,R.drawable.livolite,R.drawable.arubin,R.drawable.eprim,R.drawable.gar,R.drawable.ispargul,R.drawable.jorban,R.drawable.monera,R.drawable.red,R.drawable.ul};

    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herbal_medicine);

        listView=(ListView)findViewById(R.id.listview);
        CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


          switch(herbalmedicine[position]){

                    case "Adovas®":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.adovas));
                        intent.putExtra("image", imageme[position]);
                        Toast.makeText(HerbalMedicine.this, "Adovas", Toast.LENGTH_SHORT).show();

                        startActivity(intent);


                        break;


                    }


                    case "AmCivit®":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.amcivit));
                        intent.putExtra("image", imageme[position]);
                        Toast.makeText(HerbalMedicine.this, "Amcivit", Toast.LENGTH_SHORT).show();

                        startActivity(intent);


                        break;
                        }case "Livolite®":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.livo));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }
                        case "Arubin®":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.arubin));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }

                        case "Eprim®":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.equ));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }

                        case "Garlin™":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.gar));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }

                        case "Ispergul®":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.ispar));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }
                        case "Jorvan™":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.jovan));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }case "Monera®":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.monera));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }

                        case "Redclov™":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.red));
                        intent.putExtra("image", imageme[position]);
                        startActivity(intent);
                        break;
                        }case "Ulpep™":{

                        Intent intent = new Intent(HerbalMedicine.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.ulpe));
                        intent.putExtra("image", imageme[position]);
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
    public int getCount() {
        return imageme.length;
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
         view = getLayoutInflater().inflate(R.layout.custom, null);
        ImageView imageView=(ImageView) view.findViewById(R.id.imagelist);
        TextView textView2=(TextView) view .findViewById(R.id.text2);
        TextView textView=(TextView)view.findViewById(R.id.text1);

        imageView.setImageResource(imageme[position]);
        textView.setText(herbalmedicine [position]);
        textView2.setText(cotag [position]);
        return view;





    }
}
}
