using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace ex09_05_18
{

	
	public partial class MainForm : Form
	{
		public static string veiculo,combustivel;
		
		public MainForm()
		{

			InitializeComponent();

		}
		Teste01 teste = new Teste01();
		Teste02 teste2 = new Teste02();
		void Button1Click(object sender, EventArgs e)
		{
			
			teste.Show();

		}
		
		void Button2Click(object sender, EventArgs e)
		{
			
			teste2.Show();
        }
		
		void Button4Click(object sender, EventArgs e)
		{
			
		}
		void Button3Click(object sender, EventArgs e)
		{
			textBox1.Text = teste.combustivel;
			textBox2.Text = teste2.veiculo;
		}

	}
}
