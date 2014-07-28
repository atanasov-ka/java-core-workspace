package crawer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawer {
	
	private static HashSet<String> hashSetLinks = new HashSet<>();
	
	public static String search(URL url, String token, int levels, String encoding)
	{
		if (levels < 0)
			return null;
		
		
		String dataForAnalyze;
		try {
			dataForAnalyze = getUrlSource(url.toString(), encoding);
		} catch (IOException e1) {
			return null;
		}
		if (dataForAnalyze.contains(token))
		{
			return url.toString();
		}
		
		List<String> links = getAllLinks(dataForAnalyze);
		for (String string : links) {
			
			
			if (!string.contains("http://") && !string.contains("https://"))
			{
				if (!string.isEmpty() && string.charAt(0) != '/')
				{
					string = "/" + string;
				}
				string = url.getProtocol() + "://" + url.getHost() + string;
			}
			
			if (hashSetLinks.contains(string))
			{
				continue;
			}
			else
			{
				hashSetLinks.add(string);
			}
			
			URL urlFound;
			try {
				urlFound = new URL(string);
			} catch (MalformedURLException e) {
				System.err.println("Error" + string + "\n");
				continue;
			}
			
			if (!urlFound.getHost().equals(url.getHost()))
			{
				continue;
			}
			
			String tempUrl = search(urlFound, token, levels - 1, encoding);
			if (tempUrl != null){
				return tempUrl;
			}
		}
		
		
		return null;
	}
	
	private static String getUrlSource(String url, String encoding) throws IOException {
        URL yahoo = new URL(url);
        URLConnection yc = yahoo.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(), encoding));
        String inputLine;
        StringBuilder a = new StringBuilder();
        while ((inputLine = in.readLine()) != null)
            a.append(inputLine);
        in.close();

        return a.toString();
    }
	
	private static List<String> getAllLinks(String content) {
        ArrayList<String> resultList = new ArrayList<>();
        String regex = "<a.*?href=\"((?!javascript).*?)\".*?>";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            resultList.add(matcher.group(1));
        }
        return resultList;
    }
	
}
