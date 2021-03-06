import java.net.InetAddress.Cache

dataSource {
	pooled = false
	driverClassName = "org.h2.Driver"
	username = "sa"
	password = ""
}

environments {
	development {
		dataSource {
			dbCreate = "create-drop"
			url = "jdbc:h2:~/GeckoTemp"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:h2:~/GeckoTemp"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:h2:~/GeckoTemp;"
			
			
		}
	}
}