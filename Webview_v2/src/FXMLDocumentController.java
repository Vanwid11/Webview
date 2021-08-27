/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.scene.input.KeyEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;


/**
 *
 * @author vanes
 */
public class FXMLDocumentController implements Initializable {
    
   
    @FXML
    private WebView windowDisplay;
    @FXML
    private TextField UrlField;
  
    
    
//Google Startseite
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "http://google.com";
                web.load(urlweb);
       
        windowDisplay.getEngine().load("https://www.google.com");
        
        
    } 
//Youtube Startseite
    @FXML
    private void youtube(ActionEvent event) {
        final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "https://www.youtube.com/?hl=de";
                web.load(urlweb);
    } 
    //Searchbar
   private void searchUrl(KeyEvent event) {

         if (event.getCode().equals(KeyCode.ENTER)) {
        windowDisplay.getEngine().load(UrlField.getText());
         }
    }

    @FXML
    private void searchUrl(ActionEvent event) {
        windowDisplay.getEngine().load("https://" + UrlField.getText());
    }
//Reload (neuladen)
    @FXML
    private void reload(ActionEvent event) {
        windowDisplay.getEngine().reload();
    }
//Whatsapp Startseite
    @FXML
    private void whatsapp(ActionEvent event) {
        final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "https://www.whatsapp.com/?lang=de";
                web.load(urlweb);
        
    }
//Google Startseite
    @FXML
    private void google(ActionEvent event) {
          final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "http://google.com";
                web.load(urlweb);
    }

    @FXML
    private void awwHünde(ActionEvent event) {
          final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "https://www.google.com/search?q=cute+puppies&sxsrf=ALeKk01ApdQC6l5--oya4-K8CEgjFgtKGw:1614594300328&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiwpui98I7vAhUa7aQKHY4hBXcQ_AUoAXoECBEQAw&biw=1536&bih=754";
                web.load(urlweb);
    }

    @FXML
    private void awwKätzchen(ActionEvent event) {
         final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "https://www.google.com/search?q=cute+kitties&tbm=isch&ved=2ahUKEwiJvbe-8I7vAhWBtKQKHZGeDY4Q2-cCegQIABAA&oq=cute+kitties&gs_lcp=CgNpbWcQAzICCAAyBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB4yBAgAEB46BAgjECc6BAgAEEM6CAgAELEDEIMBOgUIABCxAzoECAAQEzoICAAQCBAeEBNQquAMWKX_DGC2gA1oAXAAeACAAUOIAZoHkgECMTWYAQCgAQGqAQtnd3Mtd2l6LWltZ8ABAQ&sclient=img&ei=_cA8YMnKJYHpkgWRvbbwCA&bih=754&biw=1536";
                web.load(urlweb);
    }

    @FXML
    private void awwKameleons(ActionEvent event) {
         final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "https://www.google.com/search?q=cute+chameleon&tbm=isch&ved=2ahUKEwii5sek8Y7vAhXvwQIHHXJhDN4Q2-cCegQIABAA&oq=cute+chameleon&gs_lcp=CgNpbWcQARgAMgIIADICCAAyAggAMgQIABAeMgQIABAeMgQIABAeMgQIABAeMgQIABAeMgQIABAeMgQIABAeOgQIIxAnOgQIABBDOggIABCxAxCDAToFCAAQsQM6BAgAEBM6BggAEB4QEzoICAAQBRAeEBM6BwgjEOoCECdQ5O4NWOmmDmCjrg5oCnAAeACAAaYBiAGxD5IBBDE5LjWYAQCgAQGqAQtnd3Mtd2l6LWltZ7ABCsABAQ&sclient=img&ei=08E8YOKwMO-Di-gP8sKx8A0&bih=754&biw=1536";
                web.load(urlweb);
    }

    @FXML
    private void awwPferde(ActionEvent event) {
          final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "https://www.google.com/search?q=cute+horses&tbm=isch&ved=2ahUKEwiiqZGKjqDvAhXKuKQKHeCgBosQ2-cCegQIABAA&oq=cute+horses&gs_lcp=CgNpbWcQAzICCAAyAggAMgIIADICCAAyAggAMgIIADIECAAQHjIECAAQHjIECAAQHjIECAAQHjoECCMQJzoFCAAQsQNQghhYiihgpCloAHAAeAKAAdkDiAHSFZIBCTMuMy4wLjIuM5gBAKABAaoBC2d3cy13aXotaW1nwAEB&sclient=img&ei=uMlFYKLtIcrxkgXgwZrYCA&bih=754&biw=1536";
                web.load(urlweb);
    }

    @FXML
    //Reddit Startseite
    private void reddit(ActionEvent event) {
        final WebEngine web = windowDisplay.getEngine();
        
        String urlweb = "https://www.reddit.com/";
                web.load(urlweb);
        
    }

   
}
   
   
    

