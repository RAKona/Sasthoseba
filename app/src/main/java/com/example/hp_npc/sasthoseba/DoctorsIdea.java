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
import android.widget.TextView;
import android.widget.Toast;

public class DoctorsIdea extends AppCompatActivity {

  ListView listView;

  String[] options={"ডায়াবেটিস এবং যক্ষ্মার সম্পর্ক","নাক দিয়ে হঠাৎ রক্ত","শিশুদের ডায়রিয়ায় কী করবেন?","জ্বর, কাশি ও গলাব্যথা","দাঁত শিরশির করলে","রুটিন চেকআপ কি জরুরি?",
          "হাড়ের ক্ষয়রোগ থেকে বাঁচবেন যেভাবে","হঠাৎ জ্বর হলে কী করবেন?","শিশুর কোষ্ঠকাঠিন্য","হঠাৎ ঘাড় শক্ত?"};
  int[] image={R.drawable.diabetics,R.drawable.nakdearokto,R.drawable.diarea,R.drawable.jor,R.drawable.dat,R.drawable.routine,R.drawable.har,
  R.drawable.zor,R.drawable.baby,R.drawable.ghar};

    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_idea);

        listView=(ListView)  findViewById(R.id.listview);
       CustomAdapter customAdapter=new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {


                switch (options[position]) {

                    case "ডায়াবেটিস এবং যক্ষ্মার সম্পর্ক": {

                        Intent intent = new Intent(DoctorsIdea.this, Result.class);
                        intent.putExtra("info", getResources().getString(R.string.diabetics));
                        intent.putExtra("image", image[position]);


                        startActivity(intent);
                        break;

                    }

                            case "নাক দিয়ে হঠাৎ রক্ত": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.nakdearokto));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }


                            case "শিশুদের ডায়রিয়ায় কী করবেন?": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.direa));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }

                             case "জ্বর, কাশি ও গলাব্যথা": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.jor));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }case "দাঁত শিরশির করলে": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.dat));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }case "রুটিন চেকআপ কি জরুরি?": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.routine));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }case "হাড়ের ক্ষয়রোগ থেকে বাঁচবেন যেভাবে": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.har));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }
                     case "হঠাৎ জ্বর হলে কী করবেন?": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.Zore));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }
 case "শিশুর কোষ্ঠকাঠিন্য": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.baby));
                                intent.putExtra("image", image[position]);


                                startActivity(intent);
                                break;

                            }case "হঠাৎ ঘাড় শক্ত?": {

                                Intent intent = new Intent(DoctorsIdea.this, Result.class);
                                intent.putExtra("info", getResources().getString(R.string.ghar));
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
    public int getCount() {
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


        view = getLayoutInflater().inflate(R.layout.custom, null);
        TextView textView=(TextView)view.findViewById(R.id.text1);
        ImageView imageView=(ImageView) view.findViewById(R.id.imagelist);

        imageView.setImageResource(image[position]);
        textView.setText(options [position]);
      
        return view;
       
    }
}
}