package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import model.Dipendente;
import model.Persona;

public class RepositoryMySql implements  IRepository{


	private ConnessioneDB conn;

	public RepositoryMySql() {
		super();
		conn = new ConnessioneDB();
	}


	@Override
	public boolean insersci(Persona p) { 
		
		String sqlInsert = "insert into dipendenti "
				+ "(cf, nome, cognome, datadinascita, luogodinascita, sesso, stipendio) "
				+ "values (?,?,?,?,?,?,?);";
		
		boolean ret = false;
		
		try {

			Connection c = ConnessioneDB.getConnectionMySql();

			PreparedStatement ps = c.prepareStatement(sqlInsert);

			ps.setString(1, p.getCf());
			ps.setString(2, p.getNome());
			ps.setString(3, p.getCognome());
			ps.setDate(4, p.getDataNascita());
			ps.setString(5, p.getLuogoNascita());
			ps.setString(6, p.getGenere());
			Dipendente d = (Dipendente) p;
			ps.setDouble(7, d.getStipendio());

			ret = ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return ret;
	}

	@Override
	public Persona leggi(String cf) {return null;}
	@Override
	public List<Persona> leggi() 
	{
		
		String sqlUpdate = "SELECT * FROM dipendenti;";
		
		try {

			Connection c = ConnessioneDB.getConnectionMySql();

			PreparedStatement ps = c.prepareStatement(sqlUpdate);

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null;
	}
	
	@Override
	public boolean modifica(Persona p) {

		String sqlUpdate = "UPDATE dipendenti SET "
				+ "cf=?, nome=?, cognome=?, datadinascita=?, luogodinascita=?, sesso=?, stipendio=? "
				+ "WHERE cf=?;";
		
		boolean ret = false;
		
		try {

			Connection c = ConnessioneDB.getConnectionMySql();

			PreparedStatement ps = c.prepareStatement(sqlUpdate);

			ps.setString(1, p.getCf());
			ps.setString(2, p.getNome());
			ps.setString(3, p.getCognome());
			ps.setDate(4, p.getDataNascita());
			ps.setString(5, p.getLuogoNascita());
			ps.setString(6, p.getGenere());
			Dipendente d = (Dipendente) p;
			ps.setDouble(7, d.getStipendio());
			
			ps.setString(8, p.getCf());
			
			ret = ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return ret;
	}
	@Override
	public boolean delete(String cf) {
		
		String sqlInsert = "DELETE FROM dipendenti WHERE cf=?;";
		boolean ret = false;
		
		try {

			Connection c = ConnessioneDB.getConnectionMySql();
			PreparedStatement ps = c.prepareStatement(sqlInsert);

			ps.setString(1, cf);
			ret = ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return ret;

		
	}


}
