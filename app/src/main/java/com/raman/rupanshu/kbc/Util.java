package com.raman.rupanshu.kbc;

import android.content.Context;
import android.os.Vibrator;
import android.util.Log;

import static android.content.Context.VIBRATOR_SERVICE;

/**
 * Created by RUPANSHU on 22-Jun-17.
 */
//TODO Make a copy of this file before randomization
class Util {
    static String[] topics = new String[]{"Current Affairs", "Cricket", "World Movies", "Indian History", "Indian Culture", "Indian Sports",
            "Indian Science and Technology", "World Geography"};
    static int[] topicsSize = new int[]{47, 16, 31, 60, 15, 60, 44, 31};
    static void loadQuestions(DatabaseHelper mydb, int[] selectedCategories) {
        Log.d("Util", "load Question started");
        //default if not topics selected
        loadEasyQuestions(mydb);
        for (int i : selectedCategories) {
            switch (i) {
                //Current Affairs
                case 0:
                    loadCurrentAffairs(mydb);
                    break;
                //Cricket
                case 1:
                    loadCricketQuestions(mydb);
                    break;
                //World movies
                case 2:
                    loadWorldMoviesQuestions(mydb);
                    break;
                //Indian History
                case 3:
                    loadIndianHistoryQuestions(mydb);
                    break;
                //Indian Culture
                case 4:
                    loadIndianCultureQuestions(mydb);
                    break;
                //Indian Sports
                case 5:
                    loadIndianSportsQuestions(mydb);
                    break;
                //Indian Science
                case 6:
                    loadIndianScienceQuestions(mydb);
                    break;
                //World Geography
                case 7:
                    loadWorldGeographyQuestions(mydb);
                    break;
            }
        }
        //mydb.insert(++counter_serial_number, "Computer Science", true, "", "", "", "", "", "c");

    }

    private static void loadCurrentAffairs(DatabaseHelper mydb) {
        int counter_serial_number = 0;
        //easy gk questions
        mydb.insert("Current Affairs", ++counter_serial_number, "Which one film declared as the Best Film in 62nd Filmfare Awards", "Dangal", "Sultan", "Nil Battey Sannata", "Ae Dil Hai Mushkil", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who is named as the world's best player for 2016 by FIFA", "Neymar", "Lionel Messi", "Cristiano Ronaldo", "Luis Suárez", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "The 14th Pravasi Bhartiya Divas held by which city", "Delhi", "Kolkata", "Bengaluru", "Gandhi Nagar", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "World Braille Day is observed on", "2nd January", "4th January", "10th January", "18th January", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which country becomes the first to ban FM radio brodcasting", "South America", "Brazil", "Ecuador", "Norway", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which team wins the Ranji Trophy final this year", "Gujarat", "Railway", "Mumbai", "Delhi", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "National Girl Child Day is observed on", "3rd January", "8th January", "12th January", "24th January", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "Virat Kohli completes 1000 runs as ODI captain in the _______ innings, which is quickest in the World", "16th", "17th", "18th", "19th", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "The bull-taming sport Jallikattu is typically practiced in", "Karnataka", "Andhra Pradesh", "Tamil Nadu", "Kerala", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which internet web portal change its name to Altaba Inc", "Google", "Yahoo", "MSN", "Twitter", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which one is the first city in India to have WiFi connectivity in public places", "Mumbai", "New Delhi", "Kolkata", "Chennai", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which Indian American is appointed as the US Ambassador to the United Nations", "Bobby Jindal", "Kamala Harris", "Nikki Haley", "Kumar P. Barve", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who wins the 2017 Australian Open Womens Single title", "Serena Williams", "Venus Williams", "Coco Vandeweghe", "Kristina Mladenovic", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who was the Chief Guest of the official ceremony in the Republic Day in 2017", "President of China", "President of France", "King of Qatar", "Crown Prince of Abu Dhabi", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which city is declared as the second capital of Himachal Pradesh", "Shimla", "Manali", "Dharamsala", "Kasauli", "c");
        //accbcdbcadabbca
        mydb.insert("Current Affairs", ++counter_serial_number, "Who is appointed as the head of the Committee formed by Supreme Court to run BCCI", "Vinod Rai", "Ramachandra Guha", "Vikram Limaye", "Diana Edulji", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who won the 2017 Australian Open Men's Single title", "Novak Djokovic", "Rafael Nadal", "Roger Federer", "Andy Murray", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Anti-Leprosy Day observed on", "18th January", "25th January", "30th January", "2nd February", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who wins the Miss Universe 2016 title", "Andrea Tovar", "Iris Mittenaere", "Siera Bearchell", "Raissa Santana", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "The 2016 Nobel Prize in Literature was won by", "Alice Munro", "Svetlana Alexievich", "Bob Dylan", "Angus Deaton", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "International Mother Language Day is celebrated on", "5th February", "12th February", "18th February", "21st February", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "Total number of satellites launched by ISRO on 15th February, 2017 is", "102", "104", "108", "110", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which film wins the Best Film award in 2017 Oscars", "Arrival", "La La Land", "Moonlight", "Lion", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who wins the Best Actress in a leading role award in 2017 Oscars", "Emma Stone", "Natalie Portman", "Meryl Streep", "Isabelle Huppert", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who wins the Best Actor in a leading role award in 2017 Oscars", "Andrew Garfield", "Ryan Gosling", "Denzel Washington", "Casey Affleck", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which two companies agreed to merge to form India's largest telecom company", "Vodafone and Idea", "Airtel and Idea", "Reliance and Aircel", "Vodafone and Aircel", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which high court recognise Ganga and Yamuna Rivers as living entity", "Uttar Pradesh High Court", "Uttarakhand High Court", "Bihar High Court", "West Bengal High Court", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "Trivendra Singh Rawat is the new Chief Minister of ________", "Uttar Pradesh", "Uttarakhand", "Punjab", "Goa", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "What is the name of the first train that is made fully in India", "Durnto", "Uttam", "Medha", "Bani", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "World Consumer Rights day is celebrated on", "15th March", "18th March", "20th March", "23rd March", "a");
        //adcaacbcaccddba
        mydb.insert("Current Affairs", ++counter_serial_number, "Which city is ranked as the best city in the world in living standards by Mercer's Quality of Living index ranking 2017", "Vienna", "Zurich", "Munich", "Geneva", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which city is ranked as the best city in India in living standards by Mercer's Quality of Living index ranking 2017", "Delhi", "Kolkata", "Gurgaon", "Hyderabad", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which team wins the 2017 Santosh Trophy of Football", "Kerala", "Goa", "Punjab", "West Bengal", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which cricket player wins the Polly Umrigar Award 2017", "Virat Kohli", "MS Dhoni", "Rohit Sharma", "Cheteshwar Pujara", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Who topped in the Forbes World's Billionaires list in 2017", "Bill Gates", "Warren Buffett", "Jeff Bezos", "Mark Zuckerberg", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which team wins the Vijay Hazare Trophy in 2017", "Maharashtra", "Delhi", "Tamil Nadu", "Karnataka", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which player creats record of longest test innings by Indian batsman in terms of balls", "Virat Kohli", "Cheteshwar Pujara", "K. L. Rahul", "Karun Nair", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "International Women's Day is celebrated on", "1st March", "5th March", "8th March", "14th March", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which university is ranked as the best university in the 2017 National Institutional Ranking Framework released by HRD", "Indian Institute of Science, Bengaluru", "Indian Institute of Technology, Madras", "Indian Institute of Technology, Kharagpur", "Banaras Hindu University (BHU)", "a");
        mydb.insert("Current Affairs", ++counter_serial_number, "India's longest tunnel, the 'Chenani-Nashri Tunnel' is located in", "Himachal Pradesh", "Tamil Nadu", "Jammu and Kashmir", "Karnataka", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "The length of the 'Chenani-Nashri Tunnel' is", "7 km", "8 km", "9 km", "11 km", "c");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which country becomes the first in World to ban metal mining", "Venezuela", "Malaysia", "Mexico", "El Salvador", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which one is the first tiger reserve in India to officially introduce a mascot", "Manas Tiger Reserve", "Valmiki Tiger Reserve", "Bandipur Tiger Reserve", "Kanha Tiger Reserve", "d");
        mydb.insert("Current Affairs", ++counter_serial_number, "The 11th edition of the Earth Hour was observed on", "18th March, 2017", "25th March, 2017", "28th March, 2017", "4th April, 2017", "b");
        mydb.insert("Current Affairs", ++counter_serial_number, "Which one country becomes the seventh member of South Asia Subregional Economic Cooperation", "Myanmar", "Sri Lanka", "Thailand", "Bhutan", "a");
        //mydb.insert(++counter_serial_number, "Current Affairs", false, "", "", "", "", "", "c");
        //c
        mydb.insert("Current Affairs", ++counter_serial_number, "What is the total weight of the India's heaviest rocket GSLV-Mk III", "520 tonne", "580 tonne", "640 tonne", "660 tonne", "c");
        //new
        mydb.insert("Current Affairs", ++counter_serial_number, "Which of the following become the first Indian building to get a Trademark recently", "Qutub Mina", "Mysore Palace", "Taj Mahal Palace", "Golden Temple", "c");
    }

    private static void loadIndianHistoryQuestions(DatabaseHelper mydb) {
        //Indian history
        //bcbcdbacaacbacb
        int counter_serial_number=0;
        //bcbcdbacaacbacb
        mydb.insert("Indian History", ++counter_serial_number, "Where did British first open their factories in Eastern part of India", "Assam", "Orissa", "Bihar", "Sikkim", "b");
        mydb.insert("Indian History", ++counter_serial_number, "When East India Company was came into existence, England was ruled by", "Hanovarians", "Stuarts", "Normans", "None of the above", "c");
        mydb.insert("Indian History", ++counter_serial_number, "In Bengal, the headquarters of East India Company were located at", "Fort St David", "Fort William", "Fort St George", "None of the above", "b");
        mydb.insert("Indian History", ++counter_serial_number, "Goa was captured by Portuguese", "1479 AD", "1575 AD", "1510 AD", "1600 AD", "c");
        mydb.insert("Indian History", ++counter_serial_number, "First Governor-General of Bengal", "Robert Clive", "William Bentinck", "Wellesley", "Warren Hastings", "d");
        mydb.insert("Indian History", ++counter_serial_number, "First Governor-General of India", "Lord Amherst", "Lord William Bentinck", "Sir Charles Metcalfe", "Robert Clive", "b");
        mydb.insert("Indian History", ++counter_serial_number, "Sati was declared illegal and punishable by", "Lord William Bentinck", "Lord Ripon", "Lord Canning", "Lord Dalhousie", "a");
        mydb.insert("Indian History", ++counter_serial_number, "The first session of the All India Congress held in Bombay in 1920, was presided over by", "J L Nehru", "VV Giri", "Lala Lajpat Rai", "MM Joshi", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Who founded Ferguson College at Pune in 1885", "Decan Educational Society", "Bharatiya Sewak Samaj", "Samaj Sewa Sangh", "Theosophical Society", "a");
        mydb.insert("Indian History", ++counter_serial_number, "First English newspaper in India", "The Bengal Gazette", "The Calcutta Gazette", "The Bengal Journal", "The Bombay Herald", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Who wrote the book \"Babuvivah\"", "Raja Rammohan Rai", "Pandit Rambai", "Ishwar Chandra Vidyasagar", "Rabindranath Tagore", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Who first translated Bhagvad Gita to English", "William Jones", "Charles Wilkins", "Alexander Cunningham", "John Marshall", "b");
        mydb.insert("Indian History", ++counter_serial_number, "First census in India was conducted at the time of", "Lord Mayo", "Lord Lytton", "Lord Auckland", "Sir John Napier", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Who was the Viceroy of India when the Rowlatt Act was Passed", "Lord Irwin", "Lord Reading", "Lord Chelmsford", "Lord Wavell", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Who introduce English as official language", "Lord William Bentick", "Sir Charles Wood", "Dalhousie", "Allan Octawain Hume", "b");
        //cacbdaaabaaabca
        mydb.insert("Indian History", ++counter_serial_number, "Who was the founder of the Indian Association", "Dadabhai Naoroji", "Bal Gangadhar Tilak", "Surendranath Banerjee", "AO Hume", "c");
        mydb.insert("Indian History", ++counter_serial_number, "The first Indian leader to undergo imprisonment", "C Vijaraghavachari", "B G Tilak", "Bipin Chandra Pal", "Dadabhai Noroji", "a");
        mydb.insert("Indian History", ++counter_serial_number, "First Indian to used the word ‘Swarajya’", "Raja Rammohan Rai", "Mahtma Gandhi", "Bal Gangadhar Tilak", "Swami Vivekanand", "c");
        mydb.insert("Indian History", ++counter_serial_number, "All India Harijan Sangha established by Mahtama Gandhi, in the year", "1935", "1932", "1920", "1927", "b");
        mydb.insert("Indian History", ++counter_serial_number, "In which place did Satyagraha first started", "Delhi", "Calcutta", "Baroda", "Champaran", "d");
        mydb.insert("Indian History", ++counter_serial_number, "Who first address Mahtma Gandhi as \"Father of Nation\"", "Subhas Chandra Bose", "Rabindra Nath Tagore", "B G Tilak", "JL Nehru", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Dandi March was began on the date of", "12th March, 1930", "15th March, 1928", "15th April, 1932", "30th March, 1932", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Which farm eastablished by Mahatma Gandhi in Natal, South Africa", "Phoenix Farm", "Tolstoy Farm", "Sabamati Ashram", "None of the above", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Who is consider as the chief architect of Tajmahal", "Mir Abd-ul Karim", "Ahmad Lahauri", "Makramat Khan", "Ustad Isa", "b");
        mydb.insert("Indian History", ++counter_serial_number, "Number of years required to build Tajmahal", "22 years", "26 years", "18 years", "12 years", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Who was the English ambassador who get permission from Jahangir to build factory for East India Company", "Thomas Roe", "William Hawkins", "Edward Tairy", "None of the above", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Mangal Pandey was a sepoy at", "34th Bengal Native Infantry", "Madras Light Cavalry", "5th Royal Gurkha Rifle", "None of the above", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Which one is the first fort contructed by British in India", "Fort William", "Fort St George", "Fort St Angelo", "Fort St David", "b");
        mydb.insert("Indian History", ++counter_serial_number, "The second battle of Panipat, 1556 fought between", "Babur and Lodi", "Maratha and Durrani", "Akbar and Hemu", "Mughal and British", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Who wrote the biography of Akbar, Akbarnama (Book of Akbar)", "Abul Fazl", "Shaikh Mubarak", "Abd al-Qadir Bada'uni", "Abdul Hamid Lahori", "a");
        //dadaabddabcadab
        mydb.insert("Indian History", ++counter_serial_number, "Qutub Minar construction was started by Qutub-ud-din Aibak in 1192, who completed the construction", "Qutub-ud-din Aibak", "Razia Sultana", "Anangpal Tomar", "Iltutmish", "d");
        mydb.insert("Indian History", ++counter_serial_number, "What is the real name of Birbal", "Maheshdas Brahmbhatt", "Amarasimha", "Ramtanu", "None of the above", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Who was not included in the 'Navaratna' of Akbar", "Birbal", "Tansen", "Raja Man Singh", "Raja Bharmal", "d");
        mydb.insert("Indian History", ++counter_serial_number, "Which one is the poem written by Kalidas (Other three are play written by Kalidas)", "Kumarasambhava", "Vikramorvasiyam", "Abhignanasakuntalam", "Malavikagnimitram", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Who is known as the Napoleon of India", "Samudragupta", "Chandragupta I", "Ramagupta", "Vikramaditya", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Kabir was the disciple of", "Vallabhacharya", "Ramanand", "Ramanuja", "None of the above", "b");
        mydb.insert("Indian History", ++counter_serial_number, "Which monument was not build by Shah Jahan", "Taj Mahal", "Red Fort", "Jama Masid", "Fatehpur Sikri", "d");
        mydb.insert("Indian History", ++counter_serial_number, "Who was the ruler of Delhi when Babur attacked India", "Sikandar Lodi", "Bahlul Lodi", "Mahmud", "Ibrahim Lodi", "d");
        mydb.insert("Indian History", ++counter_serial_number, "'Gayatri Mantra' is written in", "Rigveda", "Yajurveda", "Laxmi Puran", "None of the above", "a");
        mydb.insert("Indian History", ++counter_serial_number, "At the time of Alexander's invasion, which dynasty ruling north India", "Maurya", "Nanda", "Kushan", "Gupta", "b");
        mydb.insert("Indian History", ++counter_serial_number, "Who was not a part of 'Navaratnas' of Vikramaditya", "Kalidas", "Varahamihira", "Charaka", "Amarasimha", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Use of Zero and Decimal system was introduced during the period of which dynasty", "Gupta", "Pallav", "Maurya", "Kushan", "a");
        mydb.insert("Indian History", ++counter_serial_number, "Who was the founder of Madras", "Robert Clive", "Lord Dalhousie", "Sir John Child", "Francis Day", "d");
        mydb.insert("Indian History", ++counter_serial_number, "Who was the founder of Indian Boy Scouts", "Robert Baden-Powell", "Ernest T. Seton", "Dan Beard", "Robert Powell", "a");
        mydb.insert("Indian History", ++counter_serial_number, "The national song of India \"Vande Mataram\" was first published in which novel in 1882", "Sitaram", "Anandamath", "Gitanjali", "None of the above", "b");
        //bddccbcdbdbadad
        mydb.insert("Indian History", ++counter_serial_number, "Who had renamed the famous diamond 'Syamantaka-mani' as 'Kuh-e nur'", "Ahmad Shah Durrani", "Nadir Shah", "Sultan Mahmud", "Timur Shah Durrani", "b");
        mydb.insert("Indian History", ++counter_serial_number, "'Din-e-Ilahi' religion was founded by", "Jahangir", "Shah Jahan", "Aurengzeb", "Akbar", "d");
        mydb.insert("Indian History", ++counter_serial_number, "The other name of Chanakya is", "Samudra Gupta", "Amarsimha", "Kumar Gupta", "Vishnu Gupta", "d");
        mydb.insert("Indian History", ++counter_serial_number, "Who is the author of the book 'Rama Charitamanas'", "Kalidas", "Valmiki", "Tulshidas", "Surdas", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Vande Mataram was first sung at the session of the Indian National Congress in", "1886", "1892", "1896", "1930", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Which battle give the East Indian Company right to collection of revenue in India for first time", "Battle of Plassey", "Battle of Buxar", "Anglo-Maratha War", "Anglo-Mysore War", "b");
        mydb.insert("Indian History", ++counter_serial_number, "Who was the Governor-General of India during Indian Rebellion of 1857", "Lord Wellesley", "James Broun-Ramsay", "Charles Canning", "Lord Cornwallis", "c");
        mydb.insert("Indian History", ++counter_serial_number, "Who had implemented the 'Doctrine of Lapse' policy in India", "Lord Wellesley", "Lord Ripon", "Charles Canning", "Lord Dalhousie", "d");
        mydb.insert("Indian History", ++counter_serial_number, "Who founded Hindu reform movement 'Arya Samaj' in 1875", "Raja Ram Mohan Roy", "Dayananda Saraswati", "Swami Virajananda", "Debendranath Tagore", "b");
        mydb.insert("Indian History", ++counter_serial_number, "Who written the book 'Geet Govind'", "Banbhatta", "Kalidas", "Varahmihir", "Jayadev", "d");
        mydb.insert("Indian History", ++counter_serial_number, "The city of Agra was founded in 1504 by", "Akbar", "Sikandar Lodi", "Shah Jahan", "Ibrahim Lodi", "b");
        mydb.insert("Indian History", ++counter_serial_number, "During which Governor rule. the Indian Civil Service was introduced", "Lord Cornwallis", "Lord Macaulay", "Lord Curzon", "Lord Ripon", "a");
        mydb.insert("Indian History", ++counter_serial_number, "When the declaration of 'Purna Swaraj' made by the Indian National Congress", "1932", "1918", "1921", "1930", "d");
        mydb.insert("Indian History", ++counter_serial_number, "Which viceroy of India take the decision of Partition of Bengal", "Lord Curzon", "Lord Ripon", "Lord Wellesley", "Lord Minto", "a");
        mydb.insert("Indian History", ++counter_serial_number, "In which year the Indian National Congress was established", "1882", "1896", "1906", "1885", "d");
    }

    private static void loadCricketQuestions(DatabaseHelper mydb) {
        //Indian Cricket
        //daaaacabcabddba
        int counter_serial_number = 0;
        mydb.insert("Cricket", ++counter_serial_number, "Standard cricket bats are made of— ", "Pine wood", "Rose wood", "Teak wood", "Willow wood", "d");
        mydb.insert("Cricket", ++counter_serial_number, "How many members are slected for the committee to identify the 'few critical points' for the general body of the cricket board", "5", "7", "4", "9", "b");
        mydb.insert("Cricket", ++counter_serial_number, "Who is having the best one day bowling figures", "Muttiah Muralitharan", "Anil Kumble", "Chaminda Vaas", "Glenn McGrath", "c");
        mydb.insert("Cricket", ++counter_serial_number, "Against which team did India win its first One Day International match", "England", "Pakistan", "South Africa", "East Africa", "d");
        mydb.insert("Cricket", ++counter_serial_number, "Who holds the record for most One Day International wickets", "Shane Warne", "Kapil Dev", "Wasim Akram", "Muttiah Muralitharan", "d");
        mydb.insert("Cricket", ++counter_serial_number, "Who holds the record for most nineties in career", "Aravinda de Silva", "Nathan Astle", "Sachin Tendulkar", "Mohammad Azharuddin", "b");
        mydb.insert("Cricket", ++counter_serial_number, "Who holds the record for most catches in career (non wicket keeper)", "Mohammad Azharuddin", "Allan Border", "Rahul Dravid", "Mahela Jayawardene", "d");
        mydb.insert("Cricket", ++counter_serial_number, "Who has scored ODI fastest 1000 runs", "Sir Viv Richards", "Virat Kohli", "Jonathan Trott", "Kevin Pietersen", "a");
        mydb.insert("Cricket", ++counter_serial_number, "Who has scored ODI fastest 100 runs", "Sir Viv Richards", "Virat Kohli", "CJ Anderson", "AB de Villiers", "d");
        mydb.insert("Cricket", ++counter_serial_number, "Who has scored ODI most hundreds in a career", "Ricky Ponting", "ST Jayasuriya", "Sachin Tendulkar", "Virat Kohli", "c");
        mydb.insert("Cricket", ++counter_serial_number, "Who has the highest partnership records by runs in ODI", "Sachin Tendulkar-Rahul Dravid", "Chris Gayle-Marlon Samuels", "Sourabh Ganguly-Rahul Dravid", "Upul Tharanga-Sanath Jayasuriya", "b");
        mydb.insert("Cricket", ++counter_serial_number, "Who has taken the most wickets in test series in career", "M Muralitharan", "Anil Kumble", "Shane Warne", "GD McGrath", "a");
        mydb.insert("Cricket", ++counter_serial_number, "Who was the wicket-keeper of the Indian Cricket Team during the World Cup 2003 tournament", "Nayan Mongia", "Anil Kumble", "Rahul Dravid", "Mahendra Singh Dhoni", "c");
        mydb.insert("Cricket", ++counter_serial_number, "Which cricketer has made the highest individual score at the World Cup", "Rahul Dravid", "Saurav Ganguly", "Sachin Tendulkar", "Kapil Dev", "b");
        mydb.insert("Cricket", ++counter_serial_number, "In which year were the World Cup matches reduced to 50 overs from the previous 60 overs", "1983", "1979", "1992", "1987", "d");
        mydb.insert("Cricket", ++counter_serial_number, "Against which team Mahela Jayawardene and Kumar Sangakkara made the record of the Highest Partnership in Test Cricket", "India", "Australia", "England", "South Africa", "d");
    }

    private static void loadIndianSportsQuestions(DatabaseHelper mydb) {
        //Indian Sports
        //daaaacabcabddba
        int counter_serial_number=0;
        //daaaacabcabddba
        mydb.insert("Indian Sports", ++counter_serial_number, "National game of India", "Hockey", "Cricket", "Kabaddi", "None of the above", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Total number of gold medal won by Indian Hockey Team in Olympics", "8", "12", "6", "9", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Last Olympic gold medal won Indian Hockey Team at", "1980 – Moscow Olympic", "1964 - Japan Olympic", "1972 - Munich", "1992 – Barcelona, Spain", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "First Individual Olympic medal winner from independent India", "KD Jadav", "Harihar Banerjee", "Pradip Bode", "None of the above", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Asian Games Last held in India", "1982", "1982", "1972", "1990", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who among the following is known as Flying Sikh of India", "Kapil Dev", "PT Usha", "Milkha Singh", "Joginder Singh", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "The only driver in Indian Grand Prix 2011 is", "Alice Powell", "Sarah Fisher", "Maria Teresa", "Divina Glacia", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "In which stadium Tendulkar completed his 100th Century", "Eden Garden", "Shere Bangla Stadium", "Firoz Shah Kotla Ground", "None of the above", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Total Olympic medal won by India in 2012", "5", "4", "6", "8", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "First non test playing nation that beat India in International Cricket", "Sri Lanka", "New zealand", "Bangladesh", "Zimbabwe", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first Indian woman to win an Asian Games gold in 400m run?", "M.L.Valsamma", "Kamaljit Sandhu", "PT Usha", "K Malleswari", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the highest run scorer from India in World Cup Cricket final match,1983", "M Amarnath", "Kapil Dev", "Sunil Gavaskar", "K Srikkanth", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was india's first football captain", "P K Banerjee", "Shailen Manna", "SC Goswami", "Talimeren Ao", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Which one is the oldest football competitions in India", "Santosh Trophy", "Durand Cup", "BC Roy Trophy", "Federation Cup", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Which one is the oldest football club in India", "Mohun Bagan A.C", "East Bengal F C", "Mohammedan S C", "Mahindra United", "a");
        //caadcbbacabdbcb
        mydb.insert("Indian Sports", ++counter_serial_number, "Who hold the national record in 100m sprint running at 10.30 seconds", "Bahadur Prasad", "KM Binu", "Anil Kumar Prakash", "PT Usha", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the first President of BCCI, when it was formed in December 1928", "RE Grant Grovan", "Anthony De Mello", "JC Mukherjee", "None of the above", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who hold the world record of highest number of consecutive maiden overs in a test match", "Bapu Nadkarni", "B S Bedi", "Anil Kumble", "Subhash Gupte", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first recipient of Rajiv Gandhi Khel Ratna Award", "Sunil Gavaskar", "Sachin Tendular", "Milkha Singh", "Viswanathan Anand", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Sachin Tendulkar score his first century after playing", "56 matches", "45 matches", "78 matches", "35 matches", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Which animal represent in the mascot in Delhi Asian Games, 1982", "A tiger", "An elephant", "A lion", "A Panda", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who won the gold medal in 2010 Commonwealth games in 55kg woman wrestling", "Pooja Dhanda", "Geeta Phogat", "Ambika Guha", "Sonika Kaliraman", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "First sportsperson nominated for Rajya Sabha membership", "Sachin Tendulkar", "Milkha Singh", "Sunil Gavaskar", "Navajot S Sidhu", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the only and first indian player to compete six Olympic Games", "Karni Singh", "Randhir Singh", "Leander Paes", "Mahesh Bhupati", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first indian player to win a grand slam tournament", "Mahesh Bhupati", "Leander Paes", "Sania Mirza", "Vijay Amritraj", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the youngest grandmaster in India", "V Anand", "Parimarjan Negi", "P Harikrishnan", "Koneru Humpy", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the man of the series in 1983 Cricket World Cup", "Kapil Dev", "Rogger Binny", "K Srikanth", "Mohinder Amarnath", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who among the following is known as Payyoli Express", "Shiny Abraham", "PT Usha", "Jyotirmoyee Sikdar", "KM Beenamol", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "In Basket Ball, how many players are there in each side", "7", "9", "5", "6", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first 'woman grandmaster' of India", "Koneru Humpy", "S Vijaylaxmi", "Esha Karvade", "Madhumita Bist", "b");
        //cdbadadbcdbcbcc
        mydb.insert("Indian Sports", ++counter_serial_number, "Till 2012, how many World Chess Championship win by Vishwanathan Anand", "3", "7", "5", "6", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first recipient of 'Rajiv Gandhi Khel Ratna' award", "Sachin Tendulkar", "Kapil Dev", "Milkha Singh", "Vishwanathan Anand", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first recipient of 'Dronacharya Award' in Cricket", "Ramakant Achrekar", "Des Prem Azad", "Sunita Sarma", "None of the above", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first foreign coach to received 'Dronacharya Award'", "Blas Iglesias Fernandez", "Michael Joseph Ferreira", "Gary Kristen", "None of the above", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "In which year Viswanathan Anand become first grandmaster of India", "1990", "1992", "1985", "1987", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the winner of Indian Grand Prix Formula One, 2012", "Sebastian Vettel", "Mark Webber", "Lewis Hamilton", "Narain Karthikeyan", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Which state in India is the origination of Polo game", "Mizoram", "West Bengal", "Kashmir", "Manipur", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "In which city, the first Polo club was established in 1834", "Imphal", "Silchar", "Delhi", "Calcutta", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "How many countries participate in Delhi 2010 Commonwealth Games", "54", "64", "71", "32", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "What was the name of the official mascot in Delhi 2010 Commonwealth Games", "Orry", "Apu", "Lulu", "Shera", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Against which country india played first official international football match in 1948 London Olympics", "Brazil", "France", "England", "Holand", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first and only Indian to score a hatrick in a Olympic football match", "Abdul Hamid", "Chuni Goswami", "Neville D'Souza", "Sailen Manna", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first indian woman to win a medal in Olympic", "Sanamacha Chanu", "Karnam Malleswari", "Mary Kom", "PT Usha", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the fastest Indian/Asian woman swimmer to cross English Channel", "Shikha Tandon", "Karnam Malleswari", "Anita Sood", "Arati Saha", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the man of the series in 2011 Cricket World Cup Series", "Sachin Tendulkar", "MS Dhoni", "Yuvraj Singh", "Goutam Gambhir", "c");
        //adbdaccadcacadd
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the man of the series in 2007 t20 Cricket World Cup Series", "Shahid Afridi", "MS Dhoni", "Chris Gayle", "Umar Gul", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Which State is the highest time winner of Santosh Trophy Football", "Manipur", "Goa", "Karnataka", "West Bengal", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Which game will be dropped from 2020 Olympic Games as declared by IOC recently", "Kabadi", "Wrestling", "Discus Throw", "Archery", "b");
        mydb.insert("Indian Sports", ++counter_serial_number, "Which cricketer scored a century in each of his first 3 Test matches", "Sunil Gavaskar", "Sourav Ganguly", "Rahul Dravid", "Mohd. Azharuddin", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the flag bearer of Indian Team in 2012 Summer Olympic", "Sushil Kumar", "Mary Kom", "Vijender Singh", "Abhinav Bindra", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the first flag bearer for Indian Team in Olympic Games", "Lal Shah Bokhari", "Zafar Iqbal", "Purma Bannerjee", "Dhyan Chand", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the winner of Silver Medal in Men's High Jump in 2012 Paralympics", "Sachin Chaudhary", "Narender Ranbir", "Girisha Nagarajegowda", "Amit Kumar", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who holds the record of most goals by an individual in an Olympic Hockey final", "Balbir Singh", "Pargat Singh", "Dhyan Chand", "Zafar Iqbal", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who was the captain of the first Indian Hockey Team that participate in Olympics", "Kishan Lal", "Lal Bokhari", "Dhyan Chand", "Jaipal Singh", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "What is the name of autobiography of Indian Hockey wizard Dhyan Chand", "Playing with Fire", "My Life in Hockey", "Goal", "Score", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "National Sports Day is celebrated on", "29th August", "5th May", "12th November", "30th November", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first Indian archer to win a gold medal at the FITA Meteksan Archery World Cup in 2006.", "Rahul Banerjee", "Tarundeep Rai", "Jayanta Talukdar", "Deepika Prajapati", "c");
        mydb.insert("Indian Sports", ++counter_serial_number, "First Indian athlete to win a medal in 'World Championships in Athletics' competition", "Anju Bobby George", "PT Usha", "Milkha Singh", "KM Beenamol", "a");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the first indian shuttler to win 'All England Badminton Championships'", "Saina Nehwal", "Jwala Gutta", "Pullela Gopichand", "Prakash Padukone", "d");
        mydb.insert("Indian Sports", ++counter_serial_number, "Who is the highest run scorer in Ranji Trophy Cricket", "Amol Muzumder", "Sachin Tendulkar", "Sunil Gavaskar", "Wasim Jaffer", "d");
    }

    private static void loadIndianScienceQuestions(DatabaseHelper mydb) {
        //INdian Science and Technology
        //abdbacbadcbddb
        int counter_serial_number = 0;
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "India's first satellite Aryabhata was launched from", "Soviet Union", "America", "India", "Israel", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "First satellite to be placed in orbit by Indian made launch vehicle SLV-3mobile", "Aryabhata", "Rohini", "Bhskara-1", "INSAT", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "India's first Satellite Aryabhatta launched by India in the year", "1972", "1980", "1978", "1975", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who is known as the Father of Indian Space Program", "CV Raman", "Vikrama Sarabhai", "APJ Kalam", "Satish Dhawan", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "First mobile phone conversion take place in India between", "Jyoti basu and Sukhram", "Narasimbha Rao and Sukhram", "Ambika soni and Narasimbha Rao", "None of the above", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Internet in India was stated by VSNL in the year", "15th August,1992", "15th August,2000", "15th August,1995", "26th August,1997", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Most recent Indian citizen that won a nobel prize in 2009", "VS Naipaul", "V Ramakrishnan", "Amartyan Sen", "Mother Teresa", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "First Nuclear Plants in India", "Tarapur, Maharashtra", "Rawatbhata, Rajasthan", "Narora, Uttar Pradesh", "Kakrapar, Gujrat", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "First Nuclear Reactor made in India", "CIRUS", "Dhruva", "KAMINI", "Apsara", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "First hydro electric power plant in India", "Shimsha", "Karnataka", "Darjeeling", "Satluj", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which dam withhold the largest water reservoir in India", "Bhakra Dam", "Indrisagar Dam", "Hirakud Dam", "Tehri Dam", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "ISRO headquarter is located in", "Delhi", "Chennai", "Mumbai", "Bangalore", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "India's first unmanned lunar probe Chandrayaan-1 was launch from", "Thiruvanathapuram", "Wheeler Island", "Balasore", "Sriharikota", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "India's first supercomputer is known as", "SAGA", "PARAM 8000", "EKA", "PARAM YUVA", "b");
        //abdacadbddacbbd
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who is known as the architect of PARAM series supercomputers", "Vijay P Bhatkar", "S Ramani", "SP Mudur", "None of the above", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who is the creator of World's second and India's first test tube baby Durga", "Devi Prasad Shetty", "Subhash Mukhopadhyay", "Pratap Reddy", "Naresh Trehan", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Where is the National Institute of Ocean Technology located", "Mumbai", "Vishakhapatnam", "Kochin", "Chennai", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which one is the first IIT established in India", "IIT Kharagpur", "IIT Mumbai", "IIT Chennai", "IIT Kanpur", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Bhakra Dam is build on which river", "Krishna River", "Bhagirathi River", "Sutlej River", "Brahmaputra River", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Name the physician who created the world's second and indian's first test tube baby Durga", "Subhash Mukhopadhyay", "Deepak Chopra", "Devi Prasad Shetty", "Pratap Reddy", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which day is celebrated as National Mathematics Day in India as a respect to S Ramanujan", "17 January", "13 March", "30 August", "22 December", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "S Ramanujan is the first indian to be elected as Fellow of which one College", "Presidency College", "Trinity College", "London College", "Cambridge College", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which number is famously known as Ramanujan-Hardy number", "1004", "1992", "1309", "1729", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which scientist is known as the founder of India's first pharmaceutical company 'Bengal Chemicals & Pharmaceuticals'", "Shivram Bhoje", "Arvind Bhatnagar", "Srikumar Banerjee", "Prafulla Chandra Ray", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "The headquarter of Indian Science Congress Association is located in the city", "Kolkata", "Mumbai", "Pune", "Chennai", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who was the President of the first Indian Science Comgress meeting held in Kolkata in 1914", "Prafulla Chandra Roy", "J. C. Bose", "Ashutosh Mukherjee", "Leonard Rogers", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which one is the biggest planetarium in India", "Birla Panetarium, Hyderabad", "Birla Planetarium, Kolkata", "Guwahati Planetarium", "Nehru Planetarium, Mumbai", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who is known as the father of Indian Nuclear Programme", "APJ Abdul Kalam", "Homi J Bhabha", "Vikram Sarabhai", "Meghnad Saha", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who is founder of Indian Institute of Science, Bangalore", "Sir A.G. Bourne", "CV Raman", "Vikram Sarabhai", "Jamsetji Tata", "d");
        //cddadcdbcbbdacd
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who is the president of the Council of Scientific and Industrial Research", "President of India", "Vice-President of India", "Prime Minister of India", "Union Minister of Science and Technology", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Where is the Central Rice Reseach Institute located", "Bengaluru", "Kanpur", "Coimbator", "Cuttuck", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who constructed the 'Jantar Mantar' in Jaipur", "Ram Singh", "Man Singh I", "Rana Sanga", "Jai Singh II", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which one is India's first operational remote sensing satellite", "IRS-1A", "INSAT-1A", "GSAT-1", "PSLV-D3", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which one is India's first satellite exclusively used for educational purpose", "SARAL", "RISAT-1", "HAMSAT", "EDUSAT", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "India's first mission to Moon Chandrayaan-1 was launched from the site", "Wheeler Island", "Balasore", "Sriharikota", "None of the above", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which one is India's First Indigenous Satellite Launch Vehicle", "PSLV", "ASLV", "GSLV", "SLV-3", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who was the first chairman of Indian Space Research Organisation(ISRO)", "K kasturirangan", "Vikram Sarabhai", "Satish Dhawan", "Homi J Bhabha", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Who is known as the father of indian nuclear programme", "APJ Abdul Kalam", "Raja Ramanna", "Homi J Bhabha", "Vikram Sarabhai", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "The first nuclear test conducted in India under the code-name of Smiling Buddha in the year", "1973", "1974", "1988", "1996", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "The National Academy of Sciences, India is founded in the year", "1920", "1930", "1945", "1956", "b");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Where the Headquater of National Academy of Sciences, India is located", "Delhi", "Kolkata", "Pune", "Allahabad", "d");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Where the headquter of Central Institute for Cotton Research is located", "Nagpur", "Coimbatore", "Chennai", "Sirsa", "a");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "Which one is a India's permanent research station in Antarctica", "Ganga", "Agni", "Maitri", "None of the above", "c");
        mydb.insert("Indian Science and Technology", ++counter_serial_number, "When the first expedition to Antarctica was started by India", "1971", "1975", "1980", "1981", "d");
    }

    private static void loadWorldMoviesQuestions(DatabaseHelper mydb) {
        //dcacbdbcdbaacba
        int counter_serial_number = 0;
        //adbbcbcadabcadc
        mydb.insert("World Movies", ++counter_serial_number, "Lumière brothers, the pioneer of motion-picture are from", "French", "USA", "England", "Germany", "a");
        mydb.insert("World Movies", ++counter_serial_number, "The first ever poster designed to promote an individual film is", "Partie de cartes", "Baby's Meal", "Les Forgerons", "L'Arroseur Arrosé", "d");
        mydb.insert("World Movies", ++counter_serial_number, "From which year, Oscar Award was first awarded", "1921", "1929", "1932", "1935", "b");
        mydb.insert("World Movies", ++counter_serial_number, "Which one is the longest film to be shown in a cinema", "Grandmother Martha", "The Cure for Insomnia", "The Clock", "Heimat: A Chronicle of Germany", "b");
        mydb.insert("World Movies", ++counter_serial_number, "Who is the man with most oscar awards", "Edith Head", "John Ford", "Walt Disney", "Katharine Hepburn", "c");
        mydb.insert("World Movies", ++counter_serial_number, "Charlie Chaplin was born in", "USA", "England", "Switzerland", "Germany", "b");
        mydb.insert("World Movies", ++counter_serial_number, "Which one is Charlie Chaplin's first film", "Between Showers", "The Star Boarder", "Making a Living", "A Busy Day", "c");
        mydb.insert("World Movies", ++counter_serial_number, "In which movie Charlie Chaplin first play a speaking role", "The Great Dictator", "City Lights", "The Gold Rush", "The Kid", "a");
        mydb.insert("World Movies", ++counter_serial_number, "Who was the director of the movie 'The Bridge on the River Kwai'", "Akira Kurosawa", "Trevor Howard", "Omar Sharif", "David Lean", "d");
        mydb.insert("World Movies", ++counter_serial_number, "World famous director Akira Kurosawa is from", "Japan", "South Korea", "China", "USA", "a");
        mydb.insert("World Movies", ++counter_serial_number, "Which one is Bruce Lee's final film appearance before his death", "Fist of Fury", "Enter the Dragon", "The Big Boss", "The Way of the Dragon", "b");
        mydb.insert("World Movies", ++counter_serial_number, "When the cartoon character Mickey Mouse was first appeared in film", "1923", "1925", "1928", "1932", "c");
        mydb.insert("World Movies", ++counter_serial_number, "Which one is first James Bond movie series", "Dr No", "From Russia with Love", "Goldfinger", "Thunderball", "a");
        mydb.insert("World Movies", ++counter_serial_number, "Which director is also known as master of suspense", "Martin Scorsese", "Woody Allen", "Steven Spielberg", "Alfred Hitchcock", "d");
        mydb.insert("World Movies", ++counter_serial_number, "The movie 'The Godfather' wins the Oscar for Best Picture in the year", "1969", "1970", "1972", "1975", "c");
        //dcacbdbcdbaacba
        mydb.insert("World Movies", ++counter_serial_number, "Which one world's first full-length animated feature and the first in the Disney animated features cartoon", "Melody Time", "Pinocchio", "Fantasia", "Snow White and the Seven Dwarfs", "d");
        mydb.insert("World Movies", ++counter_serial_number, "Which one is most expensive movies ever made", "Spiderman 3", "John Carter", "Pirates of the Caribbean: At World’s End", "Avatar", "c");
        mydb.insert("World Movies", ++counter_serial_number, "Who is the director of the movie 'Avatar'", "James Cameron", "Ridley Scott", "Steven Spielberg", "George Lucas", "a");
        mydb.insert("World Movies", ++counter_serial_number, "The movie 'Titanic' was released in the year", "1995", "1996", "1997", "1999", "c");
        mydb.insert("World Movies", ++counter_serial_number, "The Lord of the Rings movie trilogy was filmed entirely in", "Australia", "New Zealand", "Malaysia", "Fiji", "b");
        mydb.insert("World Movies", ++counter_serial_number, "Who played the role of James Bond in the movie 'Dr. No'", "Barry Nelson", "Pierce Brosnan", "Roger Moore", "Sean Connery", "d");
        mydb.insert("World Movies", ++counter_serial_number, "Who played the role of Don Vito Corleone in the movie 'The Godfather'", "Robert De Niro", "Marlon Brando", "Al Pacino", "James Caan", "b");
        mydb.insert("World Movies", ++counter_serial_number, "For which film did Robert de Niro won the Oscar Award for best actor", "The Deer Hunter", "The Godfather Part II", "Raging Bull", "Taxi Driver", "c");
        mydb.insert("World Movies", ++counter_serial_number, "Which one is the oldest international film festival in the world", "Cairo", "Cannes", "Berlin", "Venice", "d");
        mydb.insert("World Movies", ++counter_serial_number, "In which film festival Palme d'Or award is given", "Toronto", "Cannes", "Berlin", "Montreal", "b");
        mydb.insert("World Movies", ++counter_serial_number, "Which one is the longest continually running film festival in the world", "Venice", "Cannes", "Berlin", "Yorkton", "a");
        mydb.insert("World Movies", ++counter_serial_number, "Venice International Film Festival was founded in the year", "1932", "1935", "1943", "1945", "a");
        mydb.insert("World Movies", ++counter_serial_number, "The first film of the Lumiere brothers was shot in", "1890", "1892", "1894", "1899", "c");
        mydb.insert("World Movies", ++counter_serial_number, "Who wrote the original book trilogy of the Lord Of The Rings", "Peter Jackson", "J. R. R. Tolkien", "J K Rowling", "Christopher Lee", "b");
        mydb.insert("World Movies", ++counter_serial_number, "Where the headquaters of Metro-Goldwyn-Mayer Studios is located", "California", "Florida", "Chicago", "Paris", "a");
        //b
        mydb.insert("World Movies", ++counter_serial_number, "In how many movies, Roger Moore plays the role of James Bond", "5", "7", "8", "11", "b");
    }

    private static void loadIndianCultureQuestions(DatabaseHelper mydb) {
        //cadbcbdccacadbc
        int counter_serial_number = 0;
        //cadbcbdccacadbc
        mydb.insert("Indian Culture", ++counter_serial_number, "Which Indian state celebrates Bihu as a folk dance", "Meghalaya", "Manipur", "Assam", "Sikkim", "c");
        mydb.insert("Indian Culture", ++counter_serial_number, "With which of the following states of India is the Garba dance associated", "Gujrat", "Punjab", "Rajasthan", "Madhya Pradesh", "a");
        mydb.insert("Indian Culture", ++counter_serial_number, "Lohri is celebrated in the month of", "April", "September", "July", "January", "d");
        mydb.insert("Indian Culture", ++counter_serial_number, "How many classical Kathakali stories are includes in traditional Kathakali dance", "51", "101", "131", "151", "b");
        mydb.insert("Indian Culture", ++counter_serial_number, "Kathakali dance is a combination of how many elements of fine art", "3", "4", "5", "7", "c");
        mydb.insert("Indian Culture", ++counter_serial_number, "Indian classical dance forms are based on the instructions of which book", "Natya Katha", "Natya Shastra", "Natya Kala", "None of the above", "b");
        mydb.insert("Indian Culture", ++counter_serial_number, "Which one is not a harvest festival in india", "Onam", "Lohri", "Ugadi", "Holi", "d");
        mydb.insert("Indian Culture", ++counter_serial_number, "How many asanas are in surya namaskar process", "6", "9", "12", "16", "c");
        mydb.insert("Indian Culture", ++counter_serial_number, "Berana is a wedding ceremony of", "Punjabi", "Assamese", "Sindhis", "Bengali", "c");
        mydb.insert("Indian Culture", ++counter_serial_number, "Sattriya dance is originated from which state", "Assam", "Odisha", "Bihar", "Uttar Pradesh", "a");
        mydb.insert("Indian Culture", ++counter_serial_number, "In which dance men wear kafni pyjamas", "Bihu", "Cholliya", "Garba", "Kathakali", "c");
        mydb.insert("Indian Culture", ++counter_serial_number, "Dollu Kunitha is a folk dance from", "Karnataka", "Tamil Nadu", "Kerala", "Bihar", "a");
        mydb.insert("Indian Culture", ++counter_serial_number, "In which district of Andhra Pradesh, the Kuchipudi village is located from which the Kuchipudi dance obtained its name", "Kurnool", "Anatapur", "Nellore", "Krishna", "d");
        mydb.insert("Indian Culture", ++counter_serial_number, "Who wrote the book 'Natya Shastra' which is the main source of Indian classical dances", "Narad", "Bharat Muni", "Abhinavagupta", "Kalidas", "b");
        mydb.insert("Indian Culture", ++counter_serial_number, "Total number of Indian classical dance forms recognized by the Sangeet Natak Akademi", "5", "7", "8", "11", "c");
    }

    private static void loadEasyQuestions(DatabaseHelper mydb) {
        int counter_serial_number = 0;
        //        (           Sr.No.         , subject,difficulty,  QUESTIONS   , A  , B  , C  , D  , correct_option)
        mydb.insert("Easy", ++counter_serial_number, "Who has become the new brand ambassador to promote Goods and Services Tax (GST)", "Aamir Khan ", "Amitabh Bachchan", "Sachin Tendulkar", "P T Usha", "b");
        mydb.insert("Easy", ++counter_serial_number, "Which of the following is the Highest grossing Hollywood Movie of all time", "Fast & Furious 7", "Avatar", "Titanic", "Jurrasic World", "b");
        mydb.insert("Easy", ++counter_serial_number, "Who is the current CEO of Google", "Sunder Pichai ", "Bill Gates", "Larry page", "Donald Trump", "a");
        mydb.insert("Easy", ++counter_serial_number, "Where was the first Peasant Movement launched by Mahatma Gandhi", "Bardoli", "Dandi", "Champaran", "Wardha", "c");
        mydb.insert("Easy", ++counter_serial_number, "Who was the Governor-General of India during the Revolt of 1857", "Lord Canning", "Lord Dalhousie", "Lord Dufferin", "Lord Hardinge", "d");
        mydb.insert("Easy", ++counter_serial_number, "Which one of the following newspapers were published first", "The Madras Mail", "The India Social Reformer", "The Bengal Gazette", "The Times of India", "c");
        mydb.insert("Easy", ++counter_serial_number, "With Which country India identify key areas to boost cooperation in Science & Technology sector", "Russia", "England", "South Africa", "China", "a");
        mydb.insert("Easy", ++counter_serial_number, "Who will be the new Union Home Secretary of India", "Madhusudhan Prasad", "Anand Kumar", "Rajiv Gauba", "Ajay Kumar Bhalla", "c");
        mydb.insert("Easy", ++counter_serial_number, "Galileo was an Italian astronomer who", "developed the telescope", "discovered four satellites of Jupiter", "discovered that the movement of pendulum produces a regular time measurement", "All of the above", "d");
        mydb.insert("Easy", ++counter_serial_number, "Exposure to sunlight helps a person improve his health because", "the infrared light kills bacteria in the body", "resistance power increases", "the pigment cells in the skin get stimulated and produce a healthy tan", "the ultraviolet rays convert skin oil into Vitamin D", "d");
        //easy gk questions
        mydb.insert("Easy", ++counter_serial_number, "Which one film declared as the Best Film in 62nd Filmfare Awards", "Dangal", "Sultan", "Nil Battey Sannata", "Ae Dil Hai Mushkil", "a");
        //dbacdaccbaddadb
        mydb.insert("Easy", ++counter_serial_number, "Anshu Jamsenpa, who became the first woman to scale Mt Everest twice in 5 days belongs to which state", "Nagaland", "Sikkim", "Meghalaya", "Arunachal Pradesh", "d");
        mydb.insert("Easy", ++counter_serial_number, "India's longest river bridge, the Dhola-Sadiya bridge is located in", "Arunachal Pradesh", "Assam", "Meghalaya", "Nagaland", "b");
        mydb.insert("Easy", ++counter_serial_number, "Which one is the most crowded city according to the World Economic Forum", "Dhaka", "Mumbai", "Singapore", "Manila", "a");
        mydb.insert("Easy", ++counter_serial_number, "Which cricketer wins the CEAT International Cricketer of the Year Award", "AB de Villiers", "Virat Kohli", "Ravichandran Ashwin", "Hashim Amla", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which actress wins the Dadasaheb Phalke Academy Award", "Aishwarya Rai", "Alia Bhatt", "Deepika Padukone", "Priyanka Chopra", "d");
        mydb.insert("Easy", ++counter_serial_number, "Who had broke the AB de Villier's record to become the fastest to score 8000 ODI run", "Virat Kohli", "Hashim Amla", "David Warner", "Steve Smith", "a");
        mydb.insert("Easy", ++counter_serial_number, "Who wins the French Open Men's single title in 2017", "Roger Federer", "Stan Wawrinka", "Rafael Nadal", "Dominic Thiem", "c");
        mydb.insert("Easy", ++counter_serial_number, "Who wins the French Open Women's single title in 2017", "Angelique Kerber", "Simona Halep", "Jeļena Ostapenko", "Svetlana Kuznetsova", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which Indian tennis star wins the French Open Mixed Doubles 2017 with Dabrowski", "Leander Paes", "Rohan Bopanna", "Mahesh Bhupathi", "Somdev Devvarman", "b");
        mydb.insert("Easy", ++counter_serial_number, "India's first private railway station, the 'Habibganj Railway Station' is located in", "Madhya Pradesh", "Uttar Pradesh", "Bihar", "Odisha", "a");
        mydb.insert("Easy", ++counter_serial_number, "In the month of June 2017 with which country, six Arab Nations cut all diplomatic ties", "Yemen", "Egypt", "Libya", "Qatar", "d");
        mydb.insert("Easy", ++counter_serial_number, "Indian origin Leo Varadkar is elected as the Prime Minister of _________", "Canada", "Denmark", "Sweden", "Ireland", "d");
        mydb.insert("Easy", ++counter_serial_number, "India's first Automatic Coastal Warning for Disasters will be deploy in", "Odisha", "Andhra Pradesh", "Tamil Nadu", "Kerala", "a");
        mydb.insert("Easy", ++counter_serial_number, "The 2017 Shanghai Cooperation Organisation (SCO) summit held in", "Shanghai", "Dushanbe", "Bishkek", "Astana", "d");
        mydb.insert("Easy", ++counter_serial_number, "Which one is the other country along with India to become a member in the Shanghai Cooperation Organisation in 2017", "Sri Lanka", "Pakistan", "Afghanistan", "Tajikistan", "b");
        mydb.insert("Easy", ++counter_serial_number, "The theme of 2017 World Hydrography Day is ___________.", "Hydrography - much more than just nautical charts", "Our seas and waterways - yet to be fully charted and explored", "International Hydrographic Cooperation - supporting safe navigation", "Mapping our seas, oceans and waterways - more important than ever", "d");
        mydb.insert("Easy", ++counter_serial_number, "Which country approved Sale of UAV Technology to India", "USA", "England", "Africa", "Australia", "a");
        mydb.insert("Easy", ++counter_serial_number, "When is GST being implemented in India", "29th June", "1st July", "7th July", "5th July", "b");
        mydb.insert("Easy", ++counter_serial_number, "Which Indian movie has won the Best Action Movie award at the Shanghai International Film Festival (SIFF)", "Wazir", "Force 2", "Baahubali: The Conclusion", "Sultan", "d");
        mydb.insert("Easy", ++counter_serial_number, "Which document is not valid for Indians travelling to Nepal and Bhutan", "Driving License", "Income Tax PAN", "Aadhaar", "Voter's card", "c");
        mydb.insert("Easy", ++counter_serial_number, "Among the following planets, which is the brightest planet", "Mercury", "Venus", "Mars", "Jupiter", "b");
        mydb.insert("Easy", ++counter_serial_number, "Among the following planets, which is the called the red planet", "Mercury", "Jupiter", "Mars", "Neptune", "c");
        mydb.insert("Easy", ++counter_serial_number, "Among the following planets, which is the called the fifth largest planet", "Jupiter", "Earth", "Venus", "Mercury", "b");
        mydb.insert("Easy", ++counter_serial_number, "Who discovered that the Earth revolves around the Sun", "Galileo Galilei", "Isaac Newton", "Albert Einstein", "Johannes Kepler", "a");
        mydb.insert("Easy", ++counter_serial_number, "What do you mean by Black Hole in our Solar System", "Contracted star with intense gravitional pull", "Collapsing of low density", "Holes occuring in heavenly bodies", "None of these", "a");
        mydb.insert("Easy", ++counter_serial_number, "Who discovered the laws of planetary orbits", "Galileo Galilei", "Nicholas Copernicus", "Johannes Kepler", "None of them", "c");
        mydb.insert("Easy", ++counter_serial_number, "What is a Supernova", "an asteriod", "a black hole", "a Comet", "a dying star", "d");
        mydb.insert("Easy", ++counter_serial_number, "How many billion Euros are fined by the European Union to Google", "2.42", "3", "5", "1.58", "a");
        mydb.insert("Easy", ++counter_serial_number, "Hitler party which came into power in 1933 is known as", "Labour Party", "Nazi Party", "Ku-Klux-Klan", "Democratic Party", "b");
        mydb.insert("Easy", ++counter_serial_number, "Who is named as the world's best player for 2016 by FIFA", "Neymar", "Lionel Messi", "Cristiano Ronaldo", "Luis Suárez", "c");
        mydb.insert("Easy", ++counter_serial_number, "For which of the following disciplines is Nobel Prize awarded", "Physics and Chemistry", "Physiology or Medicine", "Literature, Peace and Economics", "All of the above", "d");
        mydb.insert("Easy", ++counter_serial_number, "Who won ICC Champions Trophy 2017", "India", "Pakistan", "Australia", "South Africa", "b");
        mydb.insert("Easy", ++counter_serial_number, "After India, which country becomed the second biggest yoga day celebration in the world", "Egypt", "Netherlands", "South Africa", "China", "d");
        mydb.insert("Easy", ++counter_serial_number, "Which bowler has taken the most wickets in test Cricket", "Shane Warne", "Anil Kumble", "M Muralitharan", "Dale Steyn", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which country will host 2019–Cricket World Cup ", "India", "Australia", "England", "South Africa", "c");
        mydb.insert("Easy", ++counter_serial_number, "What is the theme for the International Yoga Day for 2017", "Yoga for Health", "Heal and Healthy", "Health is Wealth", "Yoga gives Healing", "a");
        mydb.insert("Easy", ++counter_serial_number, "Which malware affected 150 countries recently", "ZCrypter", "TorrentLocker", "WannaCry", "Locky", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which player has scored the fastest century", "Shahid Afridi", "Mark Boucher", "Brian Lara", "Corey Anderson", "d");
        mydb.insert("Easy", ++counter_serial_number, "To be the citizenship of India, a person must have been resident of India for how many years", "1", "2", "4", "5", "d");
        //adcaccacbcbdaca
        mydb.insert("Easy", ++counter_serial_number, "Which team wins the Deodhar Trophy Cup 2017", "Tamil Nadu", "Karnataka", "Delhi", "Punjab", "a");
        mydb.insert("Easy", ++counter_serial_number, "The Indian Civil Service Day is celebrated in India on", "3rd April", "10th April", "18th April", "21st April", "d");
        mydb.insert("Easy", ++counter_serial_number, "Which IIT Institute plans to introduce Vastu Shashtra to the architecture student", "Guwahati", "Mumbai", "Kharagpur", "Delhi", "c");
        mydb.insert("Easy", ++counter_serial_number, "Who is the first player to scores 10000 runs in T20 crickets", "Chris Gayle", "AB de Villiers", "David Warner", "Virat Kohli", "a");
        mydb.insert("Easy", ++counter_serial_number, "Which one is declared as the most-valued Public Sector Company", "TCS", "Infosys", "SBI	", "Mahindra", "c");
        mydb.insert("Easy", ++counter_serial_number, "Who is declared as the best actor in the 64th National Film Awards", "Mohanlal", "Amitabh Bachchan", "Akshay Kumar", "Mammootty", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which one is the World's first country to ban metal mining", "El Salvador", "Mexico", "Nicaragua", "Honduras", "a");
        mydb.insert("Easy", ++counter_serial_number, "Which one city is declared as the cleanest city in India under the Swachh Sarvekshan-2017", "Bhopal", "Gonda", "Indore", "Surat", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which one city is declared as the dirtiest city in India under the Swachh Sarvekshan-2017", "Bhopal", "Gonda", "Katihar", "Khurja", "b");
        mydb.insert("Easy", ++counter_serial_number, "Which one is the first state in India to shift financial year to Jan-Dec format", "West Bengal", "Bihar", "Madhya Pradesh", "Karnataka", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which one is the first city in World to gets its Own Microsoft font", "Singapore", "Dubai", "Monaco", "Tokyo", "b");
        mydb.insert("Easy", ++counter_serial_number, "Which club wins the I-league title in 2016-17", "FC Goa", "Mohun Bagan", "Shillong Lajong", "Aizawl F.C.", "d");
        mydb.insert("Easy", ++counter_serial_number, "Shankha Ghosh wins the Jnanpith award for the contribution on ________ language", "Bengali", "Assamese", "Hindi", "Odia", "a");
        mydb.insert("Easy", ++counter_serial_number, "World Asthma Day is celebrated on", "25th April", "30th April", "2nd May", "4th May", "c");
        mydb.insert("Easy", ++counter_serial_number, "Which team wins the Indian Premier League (IPL) 10", "Mumbai Indians", "Kolkata Knight Riders", "Sunrisers Hyderabad", "Royal Challengers Bangalore", "a");
    }

    private static void loadWorldGeographyQuestions(DatabaseHelper mydb) {
        //cbdcbcdacbadcbc
        int counter_serial_number=0;
        //cbdcbcdacbadcbc
        mydb.insert("World Geography", ++counter_serial_number, "In Which Country Uranium is found the Most", "Pakistan", "Nepal", "USA", "India", "d");
        mydb.insert("World Geography", ++counter_serial_number, "What is the surface temperature of Sun", "6, 000 K", "6, 200 K", "5, 778 K", "7, 194 K", "c");
        mydb.insert("World Geography", ++counter_serial_number, "Which planet in our solar system has maximum number of natural satellites", "Saturn", "Jupiter", "Urenus", "Neptune", "b");
        mydb.insert("World Geography", ++counter_serial_number, "Which planet takes the most time to rotate on its axis", "Mercury", "Mars", "Jupiter", "Venus", "d");
        mydb.insert("World Geography", ++counter_serial_number, "What is the diameter of earth", "10, 226 Km", "13, 990 Km", "12, 742 Km", "18, 527 Km", "c");
        mydb.insert("World Geography", ++counter_serial_number, "What is the name of the galaxy where the earth is located", "Barnard's Galaxy", "Milky Way Galaxy", "Andromeda I", "LGS 3", "b");
        mydb.insert("World Geography", ++counter_serial_number, "How many kilometres are represented by 1 degree of latitude", "101 Km", "105 Km", "111 Km", "119 Km", "c");
        mydb.insert("World Geography", ++counter_serial_number, "Which gas is found in highest percentage in earth atmosphere", "Oxygen", "Carbon Dioxide", "Argon", "Nitrogen", "d");
        mydb.insert("World Geography", ++counter_serial_number, "Earth axial titl (the angle between rotational axis and its orbital axis) is", "23.4 degree", "27.8 degree", "15.9 degree", "45 degree", "a");
        mydb.insert("World Geography", ++counter_serial_number, "Which one is the largest and highest plateau in the world", "Colorado Plateau", "Antarctic Plateau", "Tibetan Plateau", "Deoasai Plains", "c");
        mydb.insert("World Geography", ++counter_serial_number, "Which one is the softest mineral on earth", "Gypsum", "Talc", "Calcite", "Topaz", "b");
        mydb.insert("World Geography", ++counter_serial_number, "What one is the deepest point on Earth", "Mariana Trench", "Puerto Rico Trench", "Java Trench", "South Trench", "a");
        mydb.insert("World Geography", ++counter_serial_number, "Which one is the lowest point in the World", "Lake Eyre", "Lake Assal", "Death Valley", "Dead Sea", "d");
        mydb.insert("World Geography", ++counter_serial_number, "Which one is the largest tectonic plate", "Eurasian Plate", "Indo-Australian Plate", "Pacific Plate", "Antarctic Plate", "c");
        mydb.insert("World Geography", ++counter_serial_number, "In which country the world's highest uninterrupted waterfall Angel Falls is located", "Brazil", "Venezuela", "Zimbabwe", "Kenya", "b");
        mydb.insert("World Geography", ++counter_serial_number, "Sunda Trench lies in", "Altantic Ocean", "Pacific Ocean", "Indian Ocean", "Antarctic Ocean", "c");
        //ddacbcdcadccbdc
        mydb.insert("World Geography", ++counter_serial_number, "What is the approximate time difference between two high tides", "6 Hours", "8 Hours", "10 Hours", "12 Hours", "d");
        mydb.insert("World Geography", ++counter_serial_number, "The 38th parallel line divides which two countries", "India and Pakistan", "China and Russia", "Brazil and Chile", "North Korea and South Korea", "d");
        mydb.insert("World Geography", ++counter_serial_number, "Which city is consider as the most windy city in the World", "Wellington", "Rio Gallegoes, Argentina", "Tokyo", "Dodge City, USA", "a");
        mydb.insert("World Geography", ++counter_serial_number, "The only one river the flows from Lake Baikal is", "Selenga River", "Barguzin River", "Angara River", "Turka River", "c");
        mydb.insert("World Geography", ++counter_serial_number, "The World's largest lake Island 'Manitoulin Island' is located in", "Green Land", "Canada", "Iceland", "China", "b");
        mydb.insert("World Geography", ++counter_serial_number, "The wave generated during earthquake is known as", "Sinusoidal Waves", "Shock waves", "Seismic Wave", "Constituent Waves", "c");
        mydb.insert("World Geography", ++counter_serial_number, "Which one is the largest gulf area in the World", "Gulf of California", "Persian Gulf", "Silicon Gulf", "Gulf of Mexico", "d");
        mydb.insert("World Geography", ++counter_serial_number, "Which river passes through the most countries in the world", "Rhine", "Volga", "Danube", "Nile", "c");
        mydb.insert("World Geography", ++counter_serial_number, "Which US state is the only one that partially in the eastern hemisphere", "Alaska", "California", "Oregon", "Florida", "a");
        mydb.insert("World Geography", ++counter_serial_number, "A land which is surrounded by water on three sides is known as", "Insland", "Triangle", "Reef", "Peninsula", "d");
        mydb.insert("World Geography", ++counter_serial_number, "Which country has the longest coastline in the World", "USA", "India", "Canada", "Chile", "c");
        mydb.insert("World Geography", ++counter_serial_number, "Which one is not a Baltic State", "Estonia", "Latvia", "Belarus", "Lithuania", "c");
        mydb.insert("World Geography", ++counter_serial_number, "The Balkan Peninsula lies between which two seas", "Baltic Sea and North Sea", "Adriatic Sea and the Black Sea", "Black Sea and Mediterranean Sea", "Red Sea and Arabian Sea", "b");
        mydb.insert("World Geography", ++counter_serial_number, "Which one is a doubly landlocked country (one which is surrounded by landlocked countries)", "Mongolia", "Iraq", "Jordan", "Uzbekistan", "d");
        mydb.insert("World Geography", ++counter_serial_number, "The 'Wailing Wall' is located in the city of", "Baghdad", "Tehran", "Jerusalem", "Abu Dhabi", "c");
    }

    static void makePhoneVibrate(Context context, int timeInMilliSeconds) {
        Vibrator vb = (Vibrator) context.getSystemService(VIBRATOR_SERVICE);
        vb.vibrate(timeInMilliSeconds);
    }

    static int[] convertStringArrayToInts(String categoryPositionCounter) {
        String[] strings = categoryPositionCounter.replace("[", "").replace("]", "").split(", ");
        int result[] = new int[strings.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = Integer.parseInt(strings[i]);
        }
        return result;
    }

    static boolean[] convertStringToBoolean(String string) {
        int[] ints = convertStringArrayToInts(string);
        boolean[] result = new boolean[topics.length];
        for (int i : ints)
            result[i] = true;
        return result;
    }
}