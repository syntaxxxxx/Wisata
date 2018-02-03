package com.example.android.wisatalampung;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import static android.content.ContentValues.TAG;

/**
 * Created by fiqri hafzain islami as developer.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    //public TextView tv3;
    //deklarasi variable context

    private final Context context;
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name
    String [] name={"Lampung","Way Kambas","Anak Gunung Krakatau","Selancar di Pesisir Barat", "Teluk kiluan", "Pahawang Island", "Green Canyon", "Bendungan Batu Tegi"};
    int thumb []= {R.drawable.lampung,R.drawable.waykambas,R.drawable.krakatau,R.drawable.selancar, R.drawable.kiluan, R.drawable.pahawang, R.drawable.canyon, R.drawable.batutegi};
    String[] desk = {

            // artikel 1
                    "Lampung adalah sebuah provinsi paling selatan di Pulau Sumatera, Indonesia, Ibukotanya terletak di Bandar Lampung. Provinsi ini memilki 2 Kota dan 13 Kabupaten. Kota yang dimaksud adalah Kota Bandar Lampung dan Kota Metro. Disebelah utara berbatasan dengan Bengkulu dan Sumatera Selatan. \n" +
                    "\n" +
                    "Provinsi Lampung memiliki Pelabuhan utama bernama Pelabuhan Panjang dan Pelabuhan Bakauheni serta pelabuhan nelayan seperti Pasar Ikan (Telukbetung), Tarahan, dan Kalianda di Teluk Lampung. \n" +
                    "Di provinsi Lampung terkenal dengan simbol adat nya yaitu Siger Lampung dan Tapis berseri nya ini sangat menarik untuk dikunjungi. \n" + " Secara Geografis Provinsi Lampung terletak pada kedudukan : Timur - Barat berada antara : 103º 40' - 105º 50' Bujur Timur Utara - Selatan berada antara : 6º 45' - 3º 45' Lintang SelatanSedangkan di Teluk Semaka adalah Kota Agung (Kabupaten Tanggamus), dan di Laut Jawa terdapat pula pelabuhan nelayan seperti Labuhan Maringgai dan Ketapang. Di samping itu, Kota Menggala juga dapat dikunjungi kapal-kapal nelayan dengan menyusuri sungai Way Tulang Bawang, adapun di Samudra Indonesia terdapat Pelabuhan Krui. ",

            // artikel 2
            "Taman Nasional Way Kambas adalah taman nasional perlindungan gajah yang terletak di daerah Kecamatan Labuhan Ratu, Lampung Timur, Indonesia dan Way Kambas sendiri berdiri pada tahun 1985 yang merupakan sekolah gajah pertama di Indonesia.\n" +
                    "\n" +
                    "Bisa melalui Bandara terdekat yaitu Raden Intan 2 dan bisa juga melalui pelabuhan seperti Pelabuhan Panjang, Pelabuhan Bakauheni bagi pengunjung dari Jawa. Dan untuk Wisatawan dari lampung itu sendiri bisa menggunakan kereta bus dan kendaraan pribadi sejenisnya.\n" +
                    "\n" +
                    "Taman nasional Way Kambas ditetapkan sebagai ASEAN Heritage Park pada tahun 2006 dan yang sangat menarik adalah di Taman Nasional Way Kambas diantaranya Elephant Conservation Center, Pusat Pelatihan Gajah, Sumatran Rhino Sancutary." ,

            // artikel 3
            "Bagi wisatawan yang memiliki hobi berpetualang, Pulau Anak Gunung Krakatau akan menjadi perjalanan liburan yang tepat di Lampung.\n" +
                    "\n.\n" +
                    "\n" +
                    "Anak gunung Krakatau ini terletak di provinsi Lampung Selatan, tepatnya di salah satu pulau di kepulauan selat Sunda. Muncul akibat letusan gunung Krakatau yang dahsyat di tahun 1883, begitu hebatnya letusan tersebut sehingga menyebabkan pulau gunung Krakatau terbelah menjadi dua dan tenggelam. Seiring berjalannya waktu, dengan adanya aktivitas lava yang masih aktif, maka tumbuhlah anak gunung Krakatau yang tiap bulannya bertambah tinggi sekitar 20 inch..\n" +
                    "\n" +
                    "Untuk anda yang berminat Trip ke Wisata Anak Gunung Krakatau kalian bisa kunjungi Website Resmi dari Wista Anak Gunung Krakatau dan saya sendiri dapet informasi dari temn yang sudah pernah kesana biaya nya adalah 460.000/Orang, Dan waw menururt saya ini lumayan harga nya tapi katanya gak akan mengecewakan banget untuk berkunjung kesini dan fasilitas yang didapat juga sesuai seperti, Villa Di Pulau Sebesi, Perahu Jelajah untuk 2 Hari, Biaya Makan dan masih banyak yang lainnya sangat menarik bukan." ,

            // artikel 4
            "Tidak kalah dari Bali, Lampung juga punya wisata yang sangat keren bagi para peselancar. Namanya adalah Pantai Tanjung Setia, destinasi ini bahkan sudah menjadi spot surfing kelas dunia dan pantai ini sudah terkenal bagi turis yang suka sekali berselancar terutama dari Eropa dan pantai ini ombaknya bergulung yang sangat cocok sekali untuk berselancar sambil menikmati Sunset.\n" +
                    "\n" +
                    "Pantai Tanjung Setia ini terletak di pesisir Kabupaten Pesisir Barat, tepatnya ada di desa Tanjung Setia.\n" +
                    "\n" +
                    "Akses menuju ke Pantai Tanjung Setia bisa di tempuh dengan menggunakan jalan darat. Dengan menggunakan kendaraan umum, Traveler Bisa naik Bus dari Terminal Rajabasa di Bandar Lampung, yang melewati Jalan Raya Trans Sumatera, dan berhenti langsung di Pantai Tanjung Setia. Ongkos bus sekitar Rp 40.000-Rp 50.000. Dan lama perjalanan adalah 6 sampai 7 jam.\n" +
                    "\n" +
                    "Meskipun bagi Traveler yang tidak berselancar, menikmati keindahan pantai ini saat momen sunset juga. Traveler akan di manjakan dengan pemandangan mempesona sunset yang tidak bisa di dapatkan di Pantai lainnya semuanya hanya ada di Pantai Tanjung Setia." ,

            // artikel 5
            "Wisata alam Teluk kiluan terletak di Desa Kiluan Negeri, Kecamatan Kelumbayan, Kabupaten Tanggamus Provinsi Lampung cocok bagi wisata yang suka traveling. Perjalanan yagn merupakan sebuah tantangan tersendiri bagi Traveler yang menggunakan Kendaraan Roda 2 dan harus memiliki keterampilan dalam mengemudikan Kendaraan untuk melewatinya.\n" +
                    "\n" +
                    "Lumba-Lumba di Teluk Kiluan adalah yng terbesar di Asia. Bahkan di Dunia. Wisatawan yang bermint menyaksikan dari dekat Lumba-Lumba di Habitat aslinya bisa menyewa Perahu Katir namanya. Dan tidak hanya Lumba-Lumba para Wisatawan pun jika beruntung bisa Melihat Penyu Hijau dan para pengunjung bisa menikmati nya beberapa hari kedepan karna disana ada sebuah penginapan.\n" +
                    "\n" +
                    "Saat anda ingin pergi Teluk kiluan, pastikan dulu berapa orang yag akan anda ajak,sehinga anda dapat menentukan tarif yang akan anda keluarkan saat anda berwisata ke sana, harga yang di sediakan juga cukup terjangkau, mulai dari Rp 2.800.000 untuk 4 orang, ya tentu saja tarif ini sesuai dengan fasilita yang akan di berikan dan keindahan Teluk Kliuan itu sendiri." ,

            // artikel 6
            "Pulau Pahawang adalah salah satu pulau yang terletak di Kecamatan Punduh Padada, Kab Pesawaran, Lampung Selatan. Pulau ini terbagi menjadi dua yaitu Pahawang Besar dan Pahawang Kecil. Pemandangan yang indah, bukit pepohonan yang hijau, pasir yang berwarna putih, air laut yang jernih dan segar cocok untuk bersnorkeling di Pulau ini.\n" +
                    "\n" +
                    "Budget untuk ke pulau pahawang ini tidak besar mulai dari Rp 300.000 sampai dengan Rp 1.000.000 tergantung fasilitas apa yang traveler ingin gunakan, dan untuk detailnya ke pulau pahawang sendiri dari pusat kota mulai dari Rp. 100.000, naik kendaraan pribadi lebih hemat dan tidak memakan waktu yang lama.\n" +
                    "\n" +
                    "Bagi Traveler yang dari Pulau Jawa bisa menggunakan alat Transportasi Umum dari Pelabuhan Bakauheni Lampung Selatan seperti, Bus, Travel. Dan setelah sampai di pusat kota bisa mengggunakan angkutan umum yang langsung menuju arah Pulau Pahawang." ,
            // artikel 7
            "Ini adalah Green Canyon mini versi Lampung. Sebenarnya namanya adalah Sungai Batu Rinding, Tempat ini sekarang menjadi salah satu tempaat favorit yang harus di kunjungi karena air nya yang sejuk dan bersih tempatnya yang masih sepi dan ditambah lagi ada pemandian air panasnya juga.\n" +
                    "\n" +
                    "Sungai Batu Rinding ini terletak di Dusuun Kecapi, Desa Padang Cermin, Kecamatan Padang Cermin, Pesawaran, Lampung.\n" +
                    "\n" +
                    "Untuk biaya ke Sungai Batu Rinding ini tidak di pungut biaya karena pihat dari desa sendiri belum ingin mengelola nya karena masih belom ramai dikunjungi. Para Traveler hanya cuma membayar uang kemanan untuk parkir seikhlasnya." ,

            // artikel 8
            "Bendungan ini adalah bendungan terbesar di Asia Tenggara, ialah Bendungan BatuTegi. Bendungan Batu Tegi terletak di Pekon Batutegi Kecamatan Air Naningan, Kabupaten Tanggamus, Lampung.\n" +
                    "\n" +
                    "Tidak hanya melihat Bendungan nya saja kita akan dimanjakan untuk melihat jalan kelok 8 menurun yang sangat indah dan mempesona serta pepohonan yang hijau menjernihkan mata batin untuk di lihat.\n" +
                    "\n" +
                    "Memasuki Bendungan Batutegi Traveler hanya membayar biaya perorang sebesar Rp 2000 saja, namun untuk masuk ke area bendngan kalian harus membayar lagi untuk membayar parkir dan sangat murah tidak ada lagi biaya tambahan setelah itu." ,
    };



    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater= LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder = new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        // holder.tv3.setText(desk[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setImageResource(thumb[position]);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv2.setText(thumb[position]);
        //holder.tv3.setTag(holder);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);

    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //member aksi saat cardview diklik berdasarkan posisi tertentu
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();


            /*Toast.makeText(context, "Menu ini berada di posisi " + position, Toast.LENGTH_LONG).show();*/

            Intent intent = new Intent(context, DetailWisata.class);
            intent.putExtra("judul", vholder.tv1.getText().toString());
            intent.putExtra("gambar", thumb [position]);
            intent.putExtra("desk", desk[position]);

            context.startActivity(intent);

            Log.e(TAG,"kondisi bekerja");
        }
    };

    @Override
    public int getItemCount() {
        return name.length;
    }
}

