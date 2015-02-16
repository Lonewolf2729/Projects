using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using Excel = Microsoft.Office.Interop.Excel;
using Microsoft.Office.Core;


namespace WindowsFormsApplication1
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }
        int[] excel = new int[5];
        int[] excel2 = new int[5];
        int[] excel3 = new int[5];
        int[] excel4 = new int[5];
        int[] excel5 = new int[5];
        int[] excel6 = new int[5];
        int[] excel7 = new int[5];
        int[] excel8 = new int[5];
        int[] excel9 = new int[5];

        int[] field = new int[7];
        int[] field2 = new int[7];
        int[] field3 = new int[7];
        int[] field4 = new int[7];
        int[] field5 = new int[7];
        int[] field6 = new int[7];
        int[] field7 = new int[7];
        int[] field8 = new int[7];
        int[] field9 = new int[7];
        int n_innings = 1, innings = 1, strikes = 0, balls = 0, runs = 0, hits = 0, outs = 0, pitches = 0, outsgiven = 0, runsgivenup = 0, strikesgiven = 0, ballsgiven = 0, hitters = 0, walked = 0;
        string team, teamname;
        
        string[] s_excel = new string[2];
        

        private void textBox1_TextChanged(object sender, EventArgs e)
        {
            teamname = textBox1.Text;
        }

        private void button2_Click(object sender, EventArgs e)
        {
            ++hits;
            button2.Text = "Hits: " + hits;

        }

        private void button3_Click(object sender, EventArgs e)
        {
            ++strikes;
            button3.Text = "Strikes: " + strikes;
        }

        private void button4_Click(object sender, EventArgs e)
        {
            ++balls;
            button4.Text = "Balls: " + balls;
        }

        private void button5_Click(object sender, EventArgs e)
        {
            ++outs;
            button5.Text = "Outs: " + outs;
        }

        private void button6_Click(object sender, EventArgs e)
        {
            ++runs;
            button6.Text = "Runs: " + runs;
        }

        private void button7_Click(object sender, EventArgs e)
        {
            ++innings;
            button7.Text = "Innings: " + innings;
            if (innings == 2)
            {
                excel[0] += strikes;
                excel[1] += outs;
                excel[2] += balls;
                excel[3] += hits;
                excel[4] += runs;
                s_excel[0] = team;
                s_excel[1] = teamname;


                runs = 0;
                outs = 0;
                balls = 0;
                hits = 0;
                strikes = 0;


                button2.Text = "Hits: " + hits;
                button3.Text = "Strikes: " + strikes;
                button4.Text = "Balls: " + balls;
                button5.Text = "Outs: " + outs;
                button6.Text = "Runs: " + runs;
            }
            {
                    if(innings == 3)
                    {

                        excel2[0] += strikes;
                        excel2[1] += outs;
                        excel2[2] += balls;
                        excel2[3] += hits;
                        excel2[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                    }
                     if (innings == 4)
                    {

                        excel3[0] += strikes;
                        excel3[1] += outs;
                        excel3[2] += balls;
                        excel3[3] += hits;
                        excel3[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                    }
                    if (innings == 5)
                    {
                        excel4[0] += strikes;
                        excel4[1] += outs;
                        excel4[2] += balls;
                        excel4[3] += hits;
                        excel4[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                    }
                    if (innings == 6)
                    {
                        excel5[0] += strikes;
                        excel5[1] += outs;
                        excel5[2] += balls;
                        excel5[3] += hits;
                        excel5[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                    }
                    if (innings == 7)
                    {
                        excel6[0] += strikes;
                        excel6[1] += outs;
                        excel6[2] += balls;
                        excel6[3] += hits;
                        excel6[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                    }
                    if (innings == 8)
                    {
                        excel7[0] += strikes;
                        excel7[1] += outs;
                        excel7[2] += balls;
                        excel7[3] += hits;
                        excel7[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                    }
                    if (innings == 9)
                    {
                        excel8[0] += strikes;
                        excel8[1] += outs;
                        excel8[2] += balls;
                        excel8[3] += hits;
                        excel8[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                    }
                    if (innings == 10)
                    {
                        excel9[0] += strikes;
                        excel9[1] += outs;
                        excel9[2] += balls;
                        excel9[3] += hits;
                        excel9[4] += runs;

                        runs = 0;
                        outs = 0;
                        balls = 0;
                        hits = 0;
                        strikes = 0;

                        button2.Text = "Hits: " + hits;
                        button3.Text = "Strikes: " + strikes;
                        button4.Text = "Balls: " + balls;
                        button5.Text = "Outs: " + outs;
                        button6.Text = "Runs: " + runs;
                      
                        button7.Enabled = false;
                        MessageBox.Show("That was the last inning");
                    }
                }   
        }
        private void button8_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Team type is: " + team);
        }

        private void button9_Click(object sender, EventArgs e)
        {
            team = "Home";
            button9.Enabled = false;
            button10.Enabled = false;

        }

        private void button10_Click(object sender, EventArgs e)
        {
            team = "Away";
            button9.Enabled = false;
            button10.Enabled = false;
        }

        private void button16_Click(object sender, EventArgs e)
        {
            ++hitters;
            button16.Text = "Hitters to base: " + hitters;
        }

        private void button18_Click(object sender, EventArgs e)
        {
            ++outsgiven;
            button18.Text = "Outs: " + outsgiven;
        }

        private void button12_Click(object sender, EventArgs e)
        {
            ++pitches;
            button12.Text = "Pitches: " + pitches;
        }

        private void button14_Click(object sender, EventArgs e)
        {
            ++strikesgiven;
            button14.Text = "Strikes thrown: " + strikesgiven;
        }

        private void button15_Click(object sender, EventArgs e)
        {
            ++ballsgiven;
            button15.Text = "Balls thrown: " + ballsgiven;
        }

        private void button17_Click(object sender, EventArgs e)
        {
            ++walked;
            button17.Text = "Guys Walked: " + walked;
        }

        private void button13_Click(object sender, EventArgs e)
        {
            ++runsgivenup;
            button13.Text = "Runs given up: " + runsgivenup;
        }

        private void panel2_paint(object sender, EventArgs e)
        {
        
        }
        private void button11_Click(object sender, EventArgs e)
        {
            ++n_innings;
            int checker = 0;
            ++checker;
            button11.Text = "Innings: " + n_innings;
            if (n_innings == 2)
            {
                field[0] += hitters;
                field[1] += pitches;
                field[2] += strikesgiven;
                field[3] += runsgivenup;
                field[4] += walked;
                field[5] += ballsgiven;
                field[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;

                //string check = field[1].ToString();
                //MessageBox.Show(check);
            }
            else if (n_innings == 3)
            {
                field2[0] += hitters;
                field2[1] += pitches;
                field2[2] += strikesgiven;
                field2[3] += runsgivenup;
                field2[4] += walked;
                field2[5] += ballsgiven;
                field2[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;

                //string check2 = field2[1].ToString();
                //MessageBox.Show(check2);
            }
            else if (n_innings == 4)
            {
                field3[0] += hitters;
                field3[1] += pitches;
                field3[2] += strikesgiven;
                field3[3] += runsgivenup;
                field3[4] += walked;
                field3[5] += ballsgiven;
                field3[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;

                //string check3 = field3[1].ToString();
                //MessageBox.Show(check3);
            }
            else if (n_innings == 5)
            {
                field4[0] += hitters;
                field4[1] += pitches;
                field4[2] += strikesgiven;
                field4[3] += runsgivenup;
                field4[4] += walked;
                field4[5] += ballsgiven;
                field4[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;
                //string check4 = field4[1].ToString();
                //MessageBox.Show(check4);
            }
            else if (n_innings == 6)
            {
                field5[0] += hitters;
                field5[1] += pitches;
                field5[2] += strikesgiven;
                field5[3] += runsgivenup;
                field5[4] += walked;
                field5[5] += ballsgiven;
                field5[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;

               //string check5 = field5[1].ToString();
                //MessageBox.Show(check5);
            }
            else if (n_innings == 7)
            {
                field6[0] += hitters;
                field6[1] += pitches;
                field6[2] += strikesgiven;
                field6[3] += runsgivenup;
                field6[4] += walked;
                field6[5] += ballsgiven;
                field6[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;
                //string check6 = field6[1].ToString();
                //MessageBox.Show(check6);
            }
            else if (n_innings == 8)
            {
                field7[0] += hitters;
                field7[1] += pitches;
                field7[2] += strikesgiven;
                field7[3] += runsgivenup;
                field7[4] += walked;
                field7[5] += ballsgiven;
                field7[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;

                //string check7 = field7[1].ToString();
                //MessageBox.Show(check7);
            }
            else if (n_innings == 9)
            {
                field8[0] += hitters;
                field8[1] += pitches;
                field8[2] += strikesgiven;
                field8[3] += runsgivenup;
                field8[4] += walked;
                field8[5] += ballsgiven;
                field8[6] += outsgiven;

                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;

                //string check8 = field8[1].ToString();
                //MessageBox.Show(check8);
            }
            else if (n_innings == 10)
            {
                field9[0] += hitters;
                field9[1] += pitches;
                field9[2] += strikesgiven;
                field9[3] += runsgivenup;
                field9[4] += walked;
                field9[5] += ballsgiven;
                field9[6] += outsgiven;
                
                hitters = 0;
                pitches = 0;
                strikesgiven = 0;
                runsgivenup = 0;
                walked = 0;
                ballsgiven = 0;
                outsgiven = 0;

                button16.Text = "Hitters to base: " + hitters;
                button18.Text = "Outs: " + outsgiven;
                button12.Text = "Strikes given up: " + strikesgiven;
                button13.Text = "Runs given up: " + runsgivenup;
                button17.Text = "Guys walked: " + walked;
                button15.Text = "Balls thrown: " + ballsgiven;
                button12.Text = "Pitches: " + pitches;
               //string check = field[1].ToString();
                //MessageBox.Show(check);
                button11.Enabled = false;
                MessageBox.Show("That was the last inning");
            }
        }
         
        private void button1_Click(object sender, EventArgs e)
        {
            Excel.Application excelapp;//Excel application
            Excel._Workbook wb;//Excel Workbook
            Excel._Worksheet sht;//Excel Worksheet
            Excel.Range rng;//Excel Range(Used for cell)
            object misValue = System.Reflection.Missing.Value;
            try
            {
                //Starts up Excel and creates application
                excelapp = new Excel.Application();
                excelapp.Visible = true;
                //Creates new work book
                wb = (Excel._Workbook)(excelapp.Workbooks.Add(misValue));
                sht = (Excel._Worksheet)wb.ActiveSheet;

                //Adds the elements to the cells
                sht.Cells[1, 1] = "Team: " + teamname;
                sht.Cells[1, 2] = "Team type: " + team;
                sht.Cells[2, 1] = "Batting";
                sht.Cells[3, 1] = "Innings";
                sht.Cells[3, 2] = "Strikes";
                sht.Cells[3, 3] = "Outs";
                sht.Cells[3, 4] = "Balls";
                sht.Cells[3, 5] = "Hits";
                sht.Cells[3, 6] = "Runs";
                sht.Cells[14, 1] = "Fielding";
                sht.Cells[15, 1] = "Innings";
                sht.Cells[16, 1] = "1";
                sht.Cells[17, 1] = "2";
                sht.Cells[18, 1] = "3";
                sht.Cells[19, 1] = "4";
                sht.Cells[20, 1] = "5";
                sht.Cells[21, 1] = "6";
                sht.Cells[22, 1] = "7";
                sht.Cells[23, 1] = "8";
                sht.Cells[24, 1] = "9";
                sht.Cells[15, 2] = "Hitters to base";
                sht.Cells[15, 3] = "Pitches";
                sht.Cells[15, 4] = "Strikes thrown";
                sht.Cells[15, 5] = "Runs given up";
                sht.Cells[15, 6] = "People walked";
                sht.Cells[15, 7] = "Balls thrown";
                sht.Cells[15, 8] = "Outs";
                //Bolds the headers
                sht.get_Range("A1", "F3").Font.Bold = true;
                sht.get_Range("A14", "H15").Font.Bold = true;
                //Centers the table elements for hitting
                sht.get_Range("C1", "C6").VerticalAlignment =
                    Excel.XlVAlign.xlVAlignCenter;
                sht.get_Range("B14", "H15").VerticalAlignment =
                    Excel.XlVAlign.xlVAlignCenter;
                sht.Cells[4, 1] = "1";
                sht.Cells[5, 1] = "2";
                sht.Cells[6, 1] = "3";
                sht.Cells[7, 1] = "4";
                sht.Cells[8, 1] = "5";
                sht.Cells[9, 1] = "6";
                sht.Cells[10, 1] = "7";
                sht.Cells[11, 1] = "8";
                sht.Cells[12, 1] = "9";
                sht.Cells[4, 2] = excel[0];//strikes
                sht.Cells[5, 2] = excel2[0];
                sht.Cells[6, 2] = excel3[0];
                sht.Cells[7, 2] = excel4[0];
                sht.Cells[8, 2] = excel5[0];
                sht.Cells[9, 2] = excel6[0];
                sht.Cells[10, 2] = excel7[0];
                sht.Cells[11, 2] = excel8[0];
                sht.Cells[12, 2] = excel9[0];
                sht.Cells[4, 3] = excel[1];//Outs
                sht.Cells[5, 3] = excel2[1];
                sht.Cells[6, 3] = excel3[1];
                sht.Cells[7, 3] = excel4[1];
                sht.Cells[8, 3] = excel5[1];
                sht.Cells[9, 3] = excel6[1];
                sht.Cells[10, 3] = excel7[1];
                sht.Cells[11, 3] = excel8[1];
                sht.Cells[12, 3] = excel9[1];
                sht.Cells[4, 4] = excel[2];//balls
                sht.Cells[5, 4] = excel2[2];
                sht.Cells[6, 4] = excel3[2];
                sht.Cells[7, 4] = excel4[2];
                sht.Cells[8, 4] = excel5[2];
                sht.Cells[9, 4] = excel6[2];
                sht.Cells[10, 4] = excel7[2];
                sht.Cells[11, 4] = excel8[2];
                sht.Cells[12, 4] = excel9[2];
                sht.Cells[4, 5] = excel[3];//hits
                sht.Cells[5, 5] = excel2[3];
                sht.Cells[6, 5] = excel3[3];
                sht.Cells[7, 5] = excel4[3];
                sht.Cells[8, 5] = excel5[3];
                sht.Cells[9, 5] = excel6[3];
                sht.Cells[10, 5] = excel7[3];
                sht.Cells[11, 5] = excel8[3];
                sht.Cells[12, 5] = excel9[3];
                sht.Cells[4, 6] = excel[4];//Runs
                sht.Cells[5, 6] = excel2[4];
                sht.Cells[6, 6] = excel3[4];
                sht.Cells[7, 6] = excel4[4];
                sht.Cells[8, 6] = excel5[4];
                sht.Cells[9, 6] = excel6[4];
                sht.Cells[10, 6] = excel7[4];
                sht.Cells[11, 6] = excel8[4];
                sht.Cells[12, 6] = excel9[4];
                sht.Cells[16, 2] = field[0];
                sht.Cells[17, 2] = field2[0];
                sht.Cells[18, 2] = field3[0];
                sht.Cells[19, 2] = field4[0];
                sht.Cells[20, 2] = field5[0];
                sht.Cells[21, 2] = field6[0];
                sht.Cells[22, 2] = field7[0];
                sht.Cells[23, 2] = field8[0];
                sht.Cells[24, 2] = field9[0];
                sht.Cells[16, 3] = field[1];
                sht.Cells[17, 3] = field2[1];
                sht.Cells[18, 3] = field3[1];
                sht.Cells[19, 3] = field4[1];
                sht.Cells[20, 3] = field5[1];
                sht.Cells[21, 3] = field6[1];
                sht.Cells[22, 3] = field7[1];
                sht.Cells[23, 3] = field8[1];
                sht.Cells[24, 3] = field9[1];
                sht.Cells[16, 4] = field[2];
                sht.Cells[17, 4] = field2[2];
                sht.Cells[18, 4] = field3[2];
                sht.Cells[19, 4] = field4[2];
                sht.Cells[20, 4] = field5[2];
                sht.Cells[21, 4] = field6[2];
                sht.Cells[22, 4] = field7[2];
                sht.Cells[23, 4] = field8[2];
                sht.Cells[24, 4] = field9[2];
                sht.Cells[16, 5] = field[3];
                sht.Cells[17, 5] = field2[3];
                sht.Cells[18, 5] = field3[3];
                sht.Cells[19, 5] = field4[3];
                sht.Cells[20, 5] = field5[3];
                sht.Cells[21, 5] = field6[3];
                sht.Cells[22, 5] = field7[3];
                sht.Cells[23, 5] = field8[3];
                sht.Cells[24, 5] = field9[3];
                sht.Cells[16, 6] = field[4];
                sht.Cells[17, 6] = field2[4];
                sht.Cells[18, 6] = field3[4];
                sht.Cells[19, 6] = field4[4];
                sht.Cells[20, 6] = field5[4];
                sht.Cells[21, 6] = field6[4];
                sht.Cells[22, 6] = field7[4];
                sht.Cells[23, 6] = field8[4];
                sht.Cells[24, 6] = field9[4];
                sht.Cells[16, 7] = field[5];
                sht.Cells[17, 7] = field2[5];
                sht.Cells[18, 7] = field3[5];
                sht.Cells[19, 7] = field4[5];
                sht.Cells[20, 7] = field5[5];
                sht.Cells[21, 7] = field6[5];
                sht.Cells[22, 7] = field7[5];
                sht.Cells[23, 7] = field8[5];
                sht.Cells[24, 7] = field9[5];
                sht.Cells[16, 8] = field[6];
                sht.Cells[17, 8] = field2[6];
                sht.Cells[18, 8] = field3[6];
                sht.Cells[19, 8] = field4[6];
                sht.Cells[20, 8] = field5[6];
                sht.Cells[21, 8] = field6[6];
                sht.Cells[22, 8] = field7[6];
                sht.Cells[23, 8] = field8[6];
                sht.Cells[24, 8] = field9[6];
                sht.Cells[16, 9] = field[7];
                sht.Cells[17, 9] = field2[7];
                sht.Cells[18, 9] = field3[7];
                sht.Cells[19, 9] = field4[7];
                sht.Cells[20, 9] = field5[7];
                sht.Cells[21, 9] = field6[7];
                sht.Cells[22, 9] = field7[7];
                sht.Cells[23, 9] = field8[7];
                sht.Cells[24, 9] = field9[7];
            }
            catch
            {

            }
        }  
    }
}
