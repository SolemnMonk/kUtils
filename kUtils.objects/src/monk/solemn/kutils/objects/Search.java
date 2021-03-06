package monk.solemn.kutils.objects;

import java.util.List;

public class Search extends Entity {
	private List<Search> searches;
	private List<Channel> channels;
	private List<Bundle> bundles;
	private List<Item> items;
	
	public Search(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Search [searches=" + searches + ", channels=" + channels + ", bundles=" + bundles + ", items=" + items
				+ ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((bundles == null) ? 0 : bundles.hashCode());
		result = prime * result + ((channels == null) ? 0 : channels.hashCode());
		result = prime * result + ((items == null) ? 0 : items.hashCode());
		result = prime * result + ((searches == null) ? 0 : searches.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Search other = (Search) obj;
		if (bundles == null) {
			if (other.bundles != null)
				return false;
		} else if (!bundles.equals(other.bundles))
			return false;
		if (channels == null) {
			if (other.channels != null)
				return false;
		} else if (!channels.equals(other.channels))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		if (searches == null) {
			if (other.searches != null)
				return false;
		} else if (!searches.equals(other.searches))
			return false;
		return true;
	}

	public List<Search> getSearches() {
		return searches;
	}

	public void setSearches(List<Search> searches) {
		this.searches = searches;
	}

	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}

	public List<Bundle> getBundles() {
		return bundles;
	}

	public void setBundles(List<Bundle> bundles) {
		this.bundles = bundles;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
}
