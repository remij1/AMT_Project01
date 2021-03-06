package ch.heigvd.nackeskratta.services.dao;

import ch.heigvd.nackeskratta.model.Furniture;
import java.util.LinkedList;
import javax.ejb.Local;

@Local
public interface FurnituresManagerLocal {

	public Furniture getFurnitureById(long id);

	public LinkedList<Furniture> getFurnitures(int page, int numberPerPage);

	public int getNumberOfFurniture();

	public void generate(int nbToGenerate);

	public void insertRandomFurniture();

	public void insertFurniture(String name, int materialId, int categoryId, double price, int colorId);

	public void updateFurniture(long id, String name, int materialId, int categoryId, double price, int colorId);

	public void deleteFurniture(long id);
}
