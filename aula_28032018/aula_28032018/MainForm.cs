/*
 * Created by SharpDevelop.
 * User: Ronaldo Marchesin RA:9930001072
 * Date: 28/03/2018
 * Time: 19:26
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace aula_28032018
{
	/// <summary>
	/// Description of MainForm.
	/// </summary>
	public partial class MainForm : Form
	{
		double t_arquivo = 0, parcial;
		double tempo;
		public MainForm()
		{
			//
			// The InitializeComponent() call is required for Windows Forms designer support.
			//
			InitializeComponent();
			
			//
			// TODO: Add constructor code after the InitializeComponent() call.
			//
		}
		void Tamanho_arquivoTextChanged(object sender, EventArgs e)
		{

		}

		void Taxa_transfScroll(object sender, ScrollEventArgs e)
		{
			taxa_transferencia.Text = ((taxa_transf.Value)/10.0).ToString();
		}
		void Tempo_estimadoTextChanged(object sender, EventArgs e)
		{
			
		}
		void Tempo_restanteTextChanged(object sender, EventArgs e)
		{

		}
		void ProgressoClick(object sender, EventArgs e)
		{

		}
		void Timer1Tick(object sender, EventArgs e)
		{
			try{
				if(progresso.Value < 100){
					parcial += (taxa_transf.Value/10.0);
					if(parcial > t_arquivo){
						tempo = (double)(t_arquivo/(taxa_transf.Value/10.0)) - (double)(t_arquivo/(taxa_transf.Value/10.0));
						textBox1.Text = t_arquivo.ToString();
						tempo_estimado.Text = (t_arquivo/(taxa_transf.Value/10.0)).ToString();
						tempo_restante.Text = tempo.ToString();
						progresso.Value = (int) Math.Round(calcula_progresso(t_arquivo, parcial));
					}
					else{
						tempo = (double)(t_arquivo/(taxa_transf.Value/10.0)) - (double)(parcial/(taxa_transf.Value/10.0));
						textBox1.Text = parcial.ToString();
						tempo_estimado.Text = (t_arquivo/(taxa_transf.Value/10.0)).ToString();
						tempo_restante.Text = tempo.ToString();
						progresso.Value = (int)Math.Round(calcula_progresso(t_arquivo, parcial));
					}
				}

				else{					
					timer1.Stop();
					MessageBox.Show("Transferência concluida!");
	                Iniciar.Enabled = true;
				}
			}
			catch{
				timer1.Stop();
				//MessageBox.Show("Transferência concluida!");
	            Iniciar.Enabled = true;
			}
		}
		void IniciarClick(object sender, EventArgs e)
		{			
			try{
				if(double.Parse(tamanho_arquivo.Text) <= 0){
				   	MessageBox.Show("Tamanho do arquivo deve ser maior que zero.");
				}
				else{
					timer1.Start();
					Iniciar.Enabled = false;
					t_arquivo = Math.Abs(double.Parse(tamanho_arquivo.Text));
					taxa_transferencia.Text = ((taxa_transf.Value)/10.0).ToString();
				}
			}
			catch{
				MessageBox.Show("Informe o tamanho do arquivo!");
			}
		}
		void TextBox1TextChanged(object sender, EventArgs e)
		{
	
		}
		void Taxa_transferenciaTextChanged(object sender, EventArgs e)
		{

		}
		private double calcula_progresso(double total, double parcial)
		{
			double x;
			x = (parcial * 100)/total;
			if(x > 100){
				return x = 100;
			}
			return x;
		}
		void PausarClick(object sender, EventArgs e)
		{
			timer1.Stop();
			Iniciar.Enabled = true;
		}
		void ResetarClick(object sender, EventArgs e)
		{
			tamanho_arquivo.Text = " ";
			taxa_transferencia.Text = " ";
			textBox1.Text = " ";
			tempo_estimado.Text = " ";
			tempo_restante.Text = " ";
			taxa_transf.Value = 1;
			progresso.Value = 0;
			parcial = 0;
			t_arquivo = 0;
			tempo = 0;
		}

	}
}
